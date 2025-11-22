package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public class TrafficData {
    private int vehicleCount;
    private String signalStatus;
    private String routeRecommendation;

    public TrafficData(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public int getVehicleCount() { return vehicleCount; }
    public void setSignalStatus(String status) { signalStatus = status; }
    public void setRouteRecommendation(String route) { routeRecommendation = route; }
    public String getSignalStatus() { return signalStatus; }
    public String getRouteRecommendation() { return routeRecommendation; }
}
