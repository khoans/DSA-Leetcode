package com.nskhoa.designpattern.STRUCTURAL.bridge.example3;

public class TV implements Device {
    public void powerOn() {
        System.out.println("TV is ON");
    }

    public void powerOff() {
        System.out.println("TV is OFF");
    }
}
