package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example5;

public class EduFactory implements ToyFactory {
    public Car createCar() {
        return new EduCar();
    }

    public Doll createDoll() {
        return new EduDoll();
    }
}
