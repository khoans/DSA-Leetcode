package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class SensorData {
    private final String sensorId;
    private final double value;

    SensorData(String sensorId, double value) {
        this.sensorId = sensorId; this.value = value;
    }

    String getSensorId() {
        return sensorId;
    }

    double getValue() {
        return value;
    }
}
