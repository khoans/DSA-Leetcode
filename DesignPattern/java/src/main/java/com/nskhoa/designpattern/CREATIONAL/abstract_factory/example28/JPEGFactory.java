package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class JPEGFactory implements ImageAbstractFactory {
    public Filter createFilter() {
        return new JPEGFilter();
    }

    public Processor createProcessor() {
        return new JPEGProcessor();
    }
}
