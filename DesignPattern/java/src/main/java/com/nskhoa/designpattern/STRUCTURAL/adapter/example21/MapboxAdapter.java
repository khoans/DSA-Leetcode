package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class MapboxAdapter implements GeolocationService {
    private MapboxService mapbox = new MapboxService();
    public void getCoordinates(String address) {
        mapbox.mapboxLocate(address);
    }
}
