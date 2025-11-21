package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example31;

public class EconomyVehicleFactory implements VehiclePartsFactory {
    public Engine createEngine() {
        return new EconomyEngine();
    }

    public Wheel createWheel() {
        return new EconomyWheel();
    }

    public Body createBody() {
        return new EconomyBody();
    }
}
