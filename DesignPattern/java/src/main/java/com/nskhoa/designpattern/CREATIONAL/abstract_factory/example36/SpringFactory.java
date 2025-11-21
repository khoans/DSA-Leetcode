package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example36;

public class SpringFactory implements WebAbstractFactory {
    public Router createRouter() {
        return new SpringRouter();
    }

    public Template createTemplate() {
        return new SpringTemplate();
    }
}
