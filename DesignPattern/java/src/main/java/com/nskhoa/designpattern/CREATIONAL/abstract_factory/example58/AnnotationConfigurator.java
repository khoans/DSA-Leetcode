package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example58;

public class AnnotationConfigurator implements Configurator {
    public void configure(String props) {
        System.out.println("Annotation Configured: " + props);
    }
}
