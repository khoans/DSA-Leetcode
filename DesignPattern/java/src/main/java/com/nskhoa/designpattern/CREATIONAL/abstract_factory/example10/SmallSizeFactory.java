package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example10;

public class SmallSizeFactory implements AccessoryFactory {
    public Helmet createHelmet() {
        return new SmallHelmet();
    }

    public Glove createGlove() {
        return new SmallGlove();
    }
}
