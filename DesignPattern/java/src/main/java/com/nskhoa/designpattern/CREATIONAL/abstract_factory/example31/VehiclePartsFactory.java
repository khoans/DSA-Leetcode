package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example31;

public interface VehiclePartsFactory {
    Engine createEngine();

    Wheel createWheel();

    Body createBody();
}
