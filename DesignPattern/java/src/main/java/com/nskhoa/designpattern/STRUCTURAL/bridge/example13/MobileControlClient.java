package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public class MobileControlClient extends ControlClient {
    public MobileControlClient(SmartDevice device) { super(device); }
    public void switchOn() {
        System.out.print("Mobile Control: ");
        device.turnOn();
    }
    public void switchOff() {
        System.out.print("Mobile Control: ");
        device.turnOff();
    }
}
