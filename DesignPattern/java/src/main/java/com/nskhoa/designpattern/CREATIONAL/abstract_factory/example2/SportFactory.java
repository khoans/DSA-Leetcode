package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example2;

public class SportFactory implements OutfitFactory {
    public Shirt createShirt() {
        return new SportShirt();
    }

    public Pants createPants() {
        return new SportPants();
    }
}
