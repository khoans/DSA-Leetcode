package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example31;

public class VehicleAssembler {
    private VehiclePartsFactory factory;

    public VehicleAssembler(VehiclePartsFactory factory) {
        this.factory = factory;
    }

    public void buildVehicle() {
        Engine engine = factory.createEngine();
        Wheel wheel = factory.createWheel();
        Body body = factory.createBody();

        engine.start();
        wheel.rotate();
        body.assemble();
    }
}
