package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example6;

public class RegularFactory implements SpiceFactory {
    public Salt createSalt() {
        return new RegularSalt();
    }

    public Pepper createPepper() {
        return new RegularPepper();
    }
}
