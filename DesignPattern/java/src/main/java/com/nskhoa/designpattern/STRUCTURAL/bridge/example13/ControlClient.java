package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public abstract class ControlClient {
    protected SmartDevice device;
    protected ControlClient(SmartDevice device) { this.device = device; }
    abstract void switchOn();
    abstract void switchOff();
}
