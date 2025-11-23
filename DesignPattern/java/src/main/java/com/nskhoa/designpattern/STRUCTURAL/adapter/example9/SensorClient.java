package com.nskhoa.designpattern.STRUCTURAL.adapter.example9;

public class SensorClient {
    private Sensor sensor;

    public SensorClient(Sensor sensor) {
        this.sensor = sensor;
    }

    public void displayValue() {
        System.out.println("Sensor Value: " + sensor.readValue());
    }

    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureAdapter();
        Sensor humiditySensor = new HumidityAdapter();

        SensorClient tempClient = new SensorClient(tempSensor);
        SensorClient humidityClient = new SensorClient(humiditySensor);

        tempClient.displayValue();
        humidityClient.displayValue();
    }
}
