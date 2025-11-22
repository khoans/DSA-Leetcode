package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public class FlowAnalyzer extends TrafficHandler {
    @Override
    public void handle(TrafficData data) {
        System.out.println("Analyzing flow: vehicle count = " + data.getVehicleCount());
        if (nextHandler != null) nextHandler.handle(data);
    }
}
