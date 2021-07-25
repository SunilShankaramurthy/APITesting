package resources;

import pojo.AddPlace;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuilder {
    public AddPlace AddPlacePlaytload(){
        AddPlace placeDetails=new AddPlace();
        placeDetails.setName("more");
        placeDetails.setAddress("Doddajala");
        placeDetails.setPhone_number("(+91)-9654323456");
        placeDetails.setAccuracy(50);
        placeDetails.setLanguage("Kannada");
        AddPlace.Location loc=new AddPlace.Location();
        loc.setLat(-38.383494);
        loc.setLng(33.427362);
        placeDetails.setLocation(loc);
        List<String> typelist=new ArrayList<>();
        typelist.add("shoe park");
        typelist.add("Shop");
       placeDetails.setTypes(typelist);
       placeDetails.setWebsite("https://rahulshettyacademy.com");
       return placeDetails;

    }

}
