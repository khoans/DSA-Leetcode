package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class OpenStreetMapAdapter implements GeolocationService {
    private OpenStreetMapService osm = new OpenStreetMapService();
    public void getCoordinates(String address) {
        osm.osmLocate(address);
    }
}
