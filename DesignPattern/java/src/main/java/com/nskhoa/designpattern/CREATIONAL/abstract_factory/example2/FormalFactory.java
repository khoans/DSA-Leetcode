package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example2;

public class FormalFactory implements OutfitFactory {
    public Shirt createShirt() {
        return new FormalShirt();
    }

    public Pants createPants() {
        return new FormalPants();
    }
}
