package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example58;

public class AnnotationFactory implements SpringAbstractFactory {
    public Bean createBean() {
        return new AnnotationBean();
    }

    public Configurator createConfigurator() {
        return new AnnotationConfigurator();
    }
}
