package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class Client {
    public static void main(String[] args) {
        GeolocationService googleMapsAdapter = new GoogleMapsAdapter();
        googleMapsAdapter.getCoordinates("1600 Amphitheatre Parkway, Mountain View, CA");

        GeolocationService mapboxAdapter = new MapboxAdapter();
        mapboxAdapter.getCoordinates("1 Infinite Loop, Cupertino, CA");

        GeolocationService osmAdapter = new OpenStreetMapAdapter();
        osmAdapter.getCoordinates("350 Fifth Avenue, New York, NY");
    }
}
