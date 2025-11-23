package com.nskhoa.designpattern.STRUCTURAL.bridge.example13;

public class BridgePatternExample {
    public static void main(String[] args) {
        SmartDevice light = new LightDevice();
        SmartDevice thermostat = new ThermostatDevice();

        ControlClient mobileLightControl = new MobileControlClient(light);
        ControlClient webThermostatControl = new WebControlClient(thermostat);

        mobileLightControl.switchOn();
        mobileLightControl.switchOff();

        webThermostatControl.switchOn();
        webThermostatControl.switchOff();
    }
}
