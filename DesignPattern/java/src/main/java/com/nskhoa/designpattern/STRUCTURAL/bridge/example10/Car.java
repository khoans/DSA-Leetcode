package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public class Car extends Vehicle {
    Car(ControlSystem controlSystem) {
        super(controlSystem);
    }

    public void performAction(String action) {
        controlSystem.control(action);
    }
}
