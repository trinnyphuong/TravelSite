package fi.haagahelia.course;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Geolocation.Geolocation;
import Geolocationb.GeoThree;
import autocomplete.Autocomplete;
import geolookup.Geolookup;
import googlePlaces.NearbySearch;
import placeDetails.PlaceDetails;
import placeidSearch.PlaceidSearch;
import weatherUnderground.Forecast10days;

@Service
public class RestClientImpl implements IRestClient {

	
	//call nearby search from googleplaces api 
	public NearbySearch getGooglePlaces(String location){
		
		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location={location}&radius=2000&types=amusement_park|aquarium|art_gallery|cemetery|church|city_hall|embassy|hindu_temple|mosque|museum|park|place_of_worship|shopping_mall|stadium|synagogue|zoo&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";

		NearbySearch ns = rt.getForObject(url, NearbySearch.class,location);

		return ns;
	}
	
	//call  nearby search from googleplaces api in case of rain (search for museum, aquarium, art gallery)
	public NearbySearch getGooglePlacesRain(String location){
		
		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location={location}&radius=2000&types=museum|aquarium|art_gallery&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";

		NearbySearch ns = rt.getForObject(url, NearbySearch.class,location);

		return ns;
	}
	
	//call nearby search from googleplaces api  in case of sun (search for park)
	public NearbySearch getGooglePlacesSun(String location){
		
		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location={location}&radius=2000&types=amusement_park|park&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";

		NearbySearch ns = rt.getForObject(url, NearbySearch.class,location);

		return ns;
	}
	
	//get the location (lat/long) of a place thanks to its placeId
	public PlaceidSearch getLocation(String placeid){

		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/details/json?placeid={placeid}&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";

		PlaceidSearch ps = rt.getForObject(url, PlaceidSearch.class,placeid);

		return ps;
		
	}
	
	//call autocomplete from googleplace api
	public Autocomplete getAutocomplete(String s){

		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input={s}&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";

		Autocomplete auto = rt.getForObject(url, Autocomplete.class,s);

		return auto;
		
	}
	
	
	//call forcast10days from weatherUnderground api
	public Forecast10days getForecast10daysl(String l){
		
		RestTemplate rt = new RestTemplate();

		String url = "http://api.wunderground.com/api/5a466c528e2a6feb/forecast10day{l}.json";

		Forecast10days fc = rt.getForObject(url, Forecast10days.class,l);

		return fc;
		
	}
	
	
	//call geolookup from weatherUnderground api to get the "l" of this place
	public Geolookup geolookup(String location){
		
		RestTemplate rt = new RestTemplate();

		String url = "http://api.wunderground.com/api/5a466c528e2a6feb/geolookup/q/{location}.json";
		//String url = "http://api.wunderground.com/api/5a466c528e2a6feb/geolookup/q/37.776289,-122.395234.json";

		Geolookup gl = rt.getForObject(url, Geolookup.class, location);

		return gl;
	}
	
	//call details search from googleplaces api
	public PlaceDetails getDetails(String placeid){
		
		RestTemplate rt = new RestTemplate();

		String url = "https://maps.googleapis.com/maps/api/place/details/json?placeid={placeid}&key=AIzaSyBa-j5def_E8pjHYnRhvWrfBgCm5IHb74o";
		
		PlaceDetails pld = rt.getForObject(url, PlaceDetails.class, placeid);

		return pld;
		
		
	}
	
	//geolocation thanks to google maps API
		public String geolocalisations(){
			
			RestTemplate rt = new RestTemplate();
			GeoThree g = new GeoThree();
			String url = "https://www.googleapis.com/geolocation/v1/geolocate?key=AIzaSyD-Y1qjqyCLRwxEZVcZrB8wtvAHK4Pe_Do";
			Geolocation a = rt.postForObject(url,g, Geolocation.class);		
			String s = a.getLocation().getLat() + "," + a.getLocation().getLng();
			
			return s;
		}
	
	

}
