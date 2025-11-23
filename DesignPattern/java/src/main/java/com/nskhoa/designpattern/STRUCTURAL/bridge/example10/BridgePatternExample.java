package com.nskhoa.designpattern.STRUCTURAL.bridge.example10;

public class BridgePatternExample {
    public static void main(String[] args) {
        ControlSystem carControl = new CarControl();
        Vehicle car = new Car(carControl);
        car.performAction("Start Engine");

        ControlSystem bikeControl = new BikeControl();
        Vehicle bike = new Bike(bikeControl);
        bike.performAction("Pedal Forward");
    }
}
