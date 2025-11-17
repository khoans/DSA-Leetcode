package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example1;

public class ModernFactory implements DinnerSetFactory {
    public Plate createPlate() {
        return new ModernPlate();
    }

    public Fork createFork() {
        return new ModernFork();
    }
}
