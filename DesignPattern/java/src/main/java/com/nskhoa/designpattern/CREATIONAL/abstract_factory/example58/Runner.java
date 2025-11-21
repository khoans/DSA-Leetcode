package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example58;

public class Runner {
    public static void main(String[] args) {
        SpringAbstractFactory factory = new XMLFactory();
        Bean bean = factory.createBean();
        Configurator configurator = factory.createConfigurator();

        bean.initialize();
        configurator.configure("property=value");
    }
}
