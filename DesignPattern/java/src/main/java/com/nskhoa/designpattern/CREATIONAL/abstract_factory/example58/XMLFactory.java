package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example58;

public class XMLFactory implements SpringAbstractFactory {
    public Bean createBean() {
        return new XMLBean();
    }

    public Configurator createConfigurator() {
        return new XMLConfigurator();
    }
}
