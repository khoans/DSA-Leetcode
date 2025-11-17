package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example9;

public class AmateurFactory implements GardenFactory {
    public Shovel createShovel() {
        return new AmateurShovel();
    }

    public Scissors createScissors() {
        return new AmateurScissors();
    }
}
