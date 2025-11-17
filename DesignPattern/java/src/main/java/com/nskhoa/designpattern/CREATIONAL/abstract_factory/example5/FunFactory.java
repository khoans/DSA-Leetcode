package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example5;

public class FunFactory implements ToyFactory {
    public Car createCar() {
        return new FunCar();
    }

    public Doll createDoll() {
        return new FunDoll();
    }
}
