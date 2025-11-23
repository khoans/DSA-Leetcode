package com.nskhoa.designpattern.STRUCTURAL.bridge.example3;

public abstract class RemoteControl {
    protected Device device;

    RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();

    abstract void turnOff();
}
