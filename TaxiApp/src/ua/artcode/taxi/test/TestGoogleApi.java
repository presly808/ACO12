package ua.artcode.taxi.test;

import ua.artcode.taxi.utils.geolocation.controller.GoogleMapsAPI;
import ua.artcode.taxi.utils.geolocation.controller.GoogleMapsAPIImpl;
import ua.artcode.taxi.utils.geolocation.controller.Location;

/**
 * Created by serhii on 23.04.16.
 */
public class TestGoogleApi {

    public static void main(String[] args) {
        GoogleMapsAPI googleMapsAPI = new GoogleMapsAPIImpl();

        Location location = googleMapsAPI.findLocation("Україна Київ Бульва Лесі Українки 5");

        System.out.println(location);


        Location location1 = googleMapsAPI.findLocation("Україна", "Київ", "Бульва Лесі Українки", "5");
        Location location2 = googleMapsAPI.findLocation("Україна", "Київ", "Старокиєвська", "10");

        System.out.println(googleMapsAPI.getDistance(location1, location2));

    }
}
