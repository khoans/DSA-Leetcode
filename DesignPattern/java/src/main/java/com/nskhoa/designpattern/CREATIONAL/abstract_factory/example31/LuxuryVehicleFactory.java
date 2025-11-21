package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example31;

public class LuxuryVehicleFactory implements VehiclePartsFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Wheel createWheel() {
        return new LuxuryWheel();
    }

    public Body createBody() {
        return new LuxuryBody();
    }
}
