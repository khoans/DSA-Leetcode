package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example58;

public class XMLConfigurator implements Configurator {
    public void configure(String props) {
        System.out.println("XML Configured: " + props);
    }
}
