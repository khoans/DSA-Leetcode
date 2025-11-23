package com.nskhoa.designpattern.STRUCTURAL.bridge.example3;

public class BasicRemoteControl extends RemoteControl {
    BasicRemoteControl(Device device) {
        super(device);
    }

    public void turnOn() {
        device.powerOn();
    }

    public void turnOff() {
        device.powerOff();
    }
}
