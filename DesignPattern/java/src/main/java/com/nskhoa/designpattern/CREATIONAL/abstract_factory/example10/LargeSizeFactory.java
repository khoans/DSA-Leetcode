package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example10;

public class LargeSizeFactory implements AccessoryFactory {
    public Helmet createHelmet() {
        return new LargeHelmet();
    }

    public Glove createGlove() {
        return new LargeGlove();
    }
}
