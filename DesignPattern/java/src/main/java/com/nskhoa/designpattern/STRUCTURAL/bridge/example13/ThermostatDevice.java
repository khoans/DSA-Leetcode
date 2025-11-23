package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public class ThermostatDevice implements SmartDevice {
    public void turnOn() { System.out.println("Thermostat activated"); }
    public void turnOff() { System.out.println("Thermostat deactivated"); }
}
