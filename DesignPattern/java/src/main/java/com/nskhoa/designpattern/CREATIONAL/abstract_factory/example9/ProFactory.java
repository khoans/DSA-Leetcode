package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example9;

public class ProFactory implements GardenFactory {
    public Shovel createShovel() {
        return new ProShovel();
    }

    public Scissors createScissors() {
        return new ProScissors();
    }
}
