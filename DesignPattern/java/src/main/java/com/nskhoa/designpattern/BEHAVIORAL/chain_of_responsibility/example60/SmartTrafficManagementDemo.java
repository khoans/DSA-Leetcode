package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public class SmartTrafficManagementDemo {
    public static void main(String[] args) {
        TrafficHandler flowAnalyzer = new FlowAnalyzer();
        TrafficHandler signalAdjuster = new SignalAdjuster();
        TrafficHandler routeRecommender = new RouteRecommender();

        flowAnalyzer.setNextHandler(signalAdjuster);
        signalAdjuster.setNextHandler(routeRecommender);

        TrafficData data = new TrafficData(15);
        flowAnalyzer.handle(data);
    }
}
