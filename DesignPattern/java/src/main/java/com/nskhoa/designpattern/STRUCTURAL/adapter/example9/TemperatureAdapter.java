package com.nskhoa.designpattern.STRUCTURAL.adapter.example9;

public class TemperatureAdapter implements Sensor {
    private TemperatureSensor tempSensor = new TemperatureSensor();

    public double readValue() {
        return tempSensor.getTemperature();
    }
}
