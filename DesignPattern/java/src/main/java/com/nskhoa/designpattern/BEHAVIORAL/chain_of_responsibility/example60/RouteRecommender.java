package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public class RouteRecommender extends TrafficHandler {
    @Override
    public void handle(TrafficData data) {
        data.setRouteRecommendation("Alternative route via Main St.");
        System.out.println("Route recommended: " + data.getRouteRecommendation());
    }
}
