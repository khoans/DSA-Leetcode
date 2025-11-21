package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example31;

// Usage Example
public class Runner {
    public static void main(String[] args) {
        // Build luxury vehicle
        VehiclePartsFactory luxuryFactory = new LuxuryVehicleFactory();
        VehicleAssembler luxuryAssembler = new VehicleAssembler(luxuryFactory);
        luxuryAssembler.buildVehicle();

        System.out.println(); // Separator

        // Build economy vehicle
        VehiclePartsFactory economyFactory = new EconomyVehicleFactory();
        VehicleAssembler economyAssembler = new VehicleAssembler(economyFactory);
        economyAssembler.buildVehicle();
    }
}
