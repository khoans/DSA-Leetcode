package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class GoogleMapsAdapter implements GeolocationService {
    private GoogleMapsService googleMaps = new GoogleMapsService();
    public void getCoordinates(String address) {
        googleMaps.findLocation(address);
    }
}
