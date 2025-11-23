package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public abstract class Vehicle {
    protected ControlSystem controlSystem;

    Vehicle(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    abstract void performAction(String action);
}
