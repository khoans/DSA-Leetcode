package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example1;

public class ClassicFactory implements DinnerSetFactory {
    public Plate createPlate() {
        return new ClassicPlate();
    }

    public Fork createFork() {
        return new ClassicFork();
    }
}
