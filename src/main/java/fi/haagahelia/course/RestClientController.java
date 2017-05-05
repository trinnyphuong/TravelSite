package fi.haagahelia.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import googlePlaces.NearbySearch;

/**
 * Handles requests for the application home page.
 */
@RestController
public class RestClientController {

	
	private String location;
	private String placeid;
	private String l;
	private boolean connected; //logging in protection
	private String userName;
	String Ar[] = new String[10];
	


	@Autowired
	IRestClient restClient;
	
	@Autowired
	UserManager um;
	
	// controller set connected to false
	public RestClientController(){
		connected = false;
		userName ="";
	}
	
	public void init(){
		um.saveUser("trinh", "abc");
		um.saveSearch("trinh", "Paris, France");
	}
	
	// loggin page
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	//loggin result (success or failure)
	@RequestMapping(value = "/loginissue", method = RequestMethod.POST)
	public ModelAndView loginIssue(String id, String password) {
		ModelAndView mv = new ModelAndView("");
		mv.addObject("id", id);
		//check if user is registered
		if (um.loginUser(id, password) == true) {
			ArrayList<String> list = um.getRecentSearch(id);
			mv.addObject("recentSearch", list);
			mv.setViewName("successlogin");
			connected = true;
			userName = id;
		} else {
			System.out.println("wrong !");
			mv.setViewName("wronglogin");}
		return mv;
	}

	//register page
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	
	//register result (success or failure)
	@RequestMapping(value = "/registerissue", method = RequestMethod.POST)
	public ModelAndView registerIssue(String loginId, String pwd1, String pwd2) {	
		ModelAndView mv = new ModelAndView("");
		
		//User already exists
		if (um.findByLoginId(loginId) == false) {
			System.out.println("Id already exits");
			mv.addObject("id", loginId);
			mv.addObject("message", "Id already exists");
			mv.setViewName("wrongregister");
		}

		// The password are not the same
		else if (!pwd1.equals(pwd2)) {
			System.out.println("Confirmation is not equal to password");
			mv.addObject("id", loginId);
			mv.addObject("message", "Confirmation is not equal to password");
			mv.setViewName("wrongregister");
		} 
	
		else {
			System.out.println("Success creating user");
			System.out.println(pwd1);
			User userAccount = 	um.saveUser(loginId, pwd1);
			userAccount.setLoginId(loginId);
			userAccount.setPassword(pwd1);
//			System.out.println(userAccount.getPassword());
			um.getRecentSearch(userAccount.getLoginId());
			System.out.println(um.findAllUser().toString());
			mv.addObject("user", userAccount);
//			mv.addObject("researchList", um.getRecentSearch(userAccount.getLoginId()));
			mv.setViewName("successregister");
		}
		return mv;
	}

	// front page application
	@RequestMapping(value = "/application", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getName() {
		ModelAndView mv = new ModelAndView("application");
		return mv;
	}

	// autocomplete
	@RequestMapping(value = "/nearby/auto", method = RequestMethod.POST, produces = "application/json", params="send")
	public ModelAndView getAutocomplete(String s) {
		int i = 0;
		// if the text s not empty
		if(s.isEmpty()){
			ModelAndView m = new ModelAndView("application");
			return m;
		}
		else{
			ModelAndView mv = new ModelAndView("autocomplete");

			
			mv.addObject("autocomplete", restClient.getAutocomplete(s).getPredictions());
			return mv;
		}
		
	}
	
	//Geolocation
	@RequestMapping(value = "/nearby/auto", method = RequestMethod.POST, produces = "application/json", params="geo")
	public ModelAndView geo() {

		ModelAndView mv = new ModelAndView("nearbyResults");
		location = restClient.geolocalisations();
		
		//get location
		mv.addObject("nearbyResults", restClient.getGooglePlaces(location).getResults());
		
		String w[][] = new String[10][3];

		l = restClient.geolookup(location).getLocation().getL();
		System.out.println(l);

		// forecast weather for 10 days

		for (int i = 0; i < 20; i += 2) {

			w[i / 2][0] = restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i)
					.getTitle() + " : "
					+ restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i)
							.getFcttext();

			w[i / 2][1] = restClient.getForecast10daysl(l).getForecast().getSimpleforecast().getForecastday().get(i / 2)
					.getIconUrl();
			// get the weather (sun, rain ,cloud)
			if ((restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("rain")) || (restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("Rain")))
				w[i / 2][2] = "rain";
				
			else {
				if ((restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
						.contains("sun")) || (restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("Sun"))) {
					w[i / 2][2] = "sun";
				} else
					w[i / 2][2] = "cloud";
			}

			mv.addObject("w", w);

		}

		return mv;
	}
	
	// show the results + the weather
	@RequestMapping(value = "/nearby/auto/choix/{s}", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getPlaceid(@PathVariable String s) {

		// if someone is logged in search is saved
		if (connected == true)
		um.saveSearch(userName, s);
		System.out.println(s);
		
		ModelAndView mv = new ModelAndView("nearbyResults");

		
		for (int i = 0; i < restClient.getAutocomplete(s).getPredictions().size(); i++) {
			if (restClient.getAutocomplete(s).getPredictions().get(i).getDescription().equals(s)) {

				// get placeid of the place chosen by the user
				placeid = restClient.getAutocomplete(s).getPredictions().get(i).getPlaceId();
				System.out.println(placeid);

				// get the location thanks to placeid
				location = restClient.getLocation(placeid).getResult().getGeometry().getLocation().getLat() + ","
						+ restClient.getLocation(placeid).getResult().getGeometry().getLocation().getLng();
				System.out.println(location);

				// find all the point of interest
				mv.addObject("nearbyResults", restClient.getGooglePlaces(location).getResults());

			}
		}

		String w[][] = new String[10][3];

		l = restClient.geolookup(location).getLocation().getL();
		System.out.println(l);

		// show forecast 

		for (int i = 0; i < 20; i += 2) {

			w[i / 2][0] = restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i)
					.getTitle() + " : "
					+ restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i)
							.getFcttext();

			w[i / 2][1] = restClient.getForecast10daysl(l).getForecast().getSimpleforecast().getForecastday().get(i / 2)
					.getIconUrl();

			// check the weather
			if ((restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("rain")) || (restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("Rain")))
				w[i / 2][2] = "rain";
				
			else {
				if ((restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
						.contains("sun")) || (restClient.getForecast10daysl(l).getForecast().getTxtForecast().getForecastday().get(i).getFcttext()
					.contains("Sun"))) {
					w[i / 2][2] = "sun";
				} else
					w[i / 2][2] = "cloud";
			}

			mv.addObject("w", w);

		}

		return mv;
	}

	// place details
	@RequestMapping(value = "/nearby/result/details/{placeid}", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getDetails(@PathVariable String placeid) {

		ModelAndView mv = new ModelAndView("resultDetails");

		mv.addObject("resultDetails", restClient.getDetails(placeid).getResult());
		return mv;
	}
	
	// results depending on the weather : sunny rainy cloudy
	@RequestMapping(value = "/nearby/result/weatherDetail/{weather}", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getWeatherDetail(@PathVariable String weather) {

		ModelAndView mv = new ModelAndView("weatherDetail");

		// find all the point of interest depending on the weather 
		if(weather.equals("rain")){ 
			mv.addObject("weatherDetail", restClient.getGooglePlacesRain(location).getResults());
			mv.addObject("weatherCondition", "rainy");
		}
		if(weather.equals("sun")){
			mv.addObject("weatherDetail", restClient.getGooglePlacesSun(location).getResults());
			mv.addObject("weatherCondition", "sunny");
		}
		if(weather.equals("cloud")){
			mv.addObject("weatherDetail", restClient.getGooglePlaces(location).getResults());
			mv.addObject("weatherCondition", "cloudly");
		}
		
		return mv;
	}



	

	
}
