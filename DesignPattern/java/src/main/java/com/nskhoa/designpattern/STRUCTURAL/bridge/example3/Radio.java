package com.nskhoa.designpattern.STRUCTURAL.bridge.example3;

public class Radio implements Device {
    public void powerOn() {
        System.out.println("Radio is ON");
    }

    public void powerOff() {
        System.out.println("Radio is OFF");
    }
}
