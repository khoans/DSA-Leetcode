package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public class LightDevice implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}
