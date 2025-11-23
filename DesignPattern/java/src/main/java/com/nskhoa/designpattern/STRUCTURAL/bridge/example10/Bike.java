package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public class Bike extends Vehicle {
    Bike(ControlSystem controlSystem) {
        super(controlSystem);
    }

    public void performAction(String action) {
        controlSystem.control(action);
    }
}
