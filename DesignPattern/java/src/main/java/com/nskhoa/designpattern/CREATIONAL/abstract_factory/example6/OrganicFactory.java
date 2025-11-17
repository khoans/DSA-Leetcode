package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example6;

public class OrganicFactory implements SpiceFactory {
    public Salt createSalt() {
        return new OrganicSalt();
    }

    public Pepper createPepper() {
        return new OrganicPepper();
    }
}
