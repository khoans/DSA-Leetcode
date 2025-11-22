package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public class SignalAdjuster extends TrafficHandler {
    @Override
    public void handle(TrafficData data) {
        if (data.getVehicleCount() > 10) {
            data.setSignalStatus("Green extended");
            System.out.println("Signal adjusted: " + data.getSignalStatus());
        }
        if (nextHandler != null) nextHandler.handle(data);
    }
}
