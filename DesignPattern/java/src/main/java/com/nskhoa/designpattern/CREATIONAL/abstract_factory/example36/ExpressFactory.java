package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example36;

public class ExpressFactory implements WebAbstractFactory {
    public Router createRouter() {
        return new ExpressRouter();
    }

    public Template createTemplate() {
        return new ExpressTemplate();
    }
}
