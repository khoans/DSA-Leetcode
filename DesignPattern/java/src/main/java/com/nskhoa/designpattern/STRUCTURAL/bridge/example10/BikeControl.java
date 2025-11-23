package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public class BikeControl implements ControlSystem {
    public void control(String command) {
        System.out.println("Bike executing: " + command);
    }
}
