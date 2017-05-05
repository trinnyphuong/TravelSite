package fi.haagahelia.course;

import autocomplete.Autocomplete;
import geolookup.Geolookup;
import googlePlaces.NearbySearch;
import placeidSearch.Geometry;
import placeidSearch.PlaceidSearch;
import weatherUnderground.Forecast10days;
import googlePlaces.Result;
import placeDetails.PlaceDetails;


public interface IRestClient {

	
	NearbySearch getGooglePlaces(String location);
	
	NearbySearch getGooglePlacesRain(String location);
	
	NearbySearch getGooglePlacesSun(String location);
	
	PlaceidSearch getLocation(String placeid);
	
	Autocomplete getAutocomplete(String s);
		
	Forecast10days getForecast10daysl(String l);
	
	Geolookup geolookup(String location);
	
	PlaceDetails getDetails(String placeid);
	
	String geolocalisations();

	

	
}
