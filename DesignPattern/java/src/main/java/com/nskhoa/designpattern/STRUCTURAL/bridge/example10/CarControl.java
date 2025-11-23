package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public class CarControl implements ControlSystem {
    public void control(String command) {
        System.out.println("Car executing: " + command);
    }
}
