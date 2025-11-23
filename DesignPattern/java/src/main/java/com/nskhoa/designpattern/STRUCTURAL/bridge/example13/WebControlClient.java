package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public class WebControlClient extends ControlClient {
    public WebControlClient(SmartDevice device) { super(device); }
    public void switchOn() {
        System.out.print("Web Control: ");
        device.turnOn();
    }
    public void switchOff() {
        System.out.print("Web Control: ");
        device.turnOff();
    }
}
