package com.nskhoa.designpattern.STRUCTURAL.adapter.example9;

public class HumidityAdapter implements Sensor {
    private HumiditySensor humiditySensor = new HumiditySensor();

    public double readValue() {
        return humiditySensor.getHumidity();
    }
}
