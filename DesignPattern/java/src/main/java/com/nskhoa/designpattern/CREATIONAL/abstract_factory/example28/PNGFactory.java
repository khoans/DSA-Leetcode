package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class PNGFactory implements ImageAbstractFactory {
    public Filter createFilter() {
        return new PNGFilter();
    }

    public Processor createProcessor() {
        return new PNGProcessor();
    }
}
