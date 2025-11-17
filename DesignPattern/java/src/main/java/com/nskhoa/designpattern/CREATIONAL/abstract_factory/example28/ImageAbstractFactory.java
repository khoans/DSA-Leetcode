package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public interface ImageAbstractFactory {
    Filter createFilter();

    Processor createProcessor();
}

// Usage: ImageAbstractFactory factory = new JPEGFactory(); Filter filter = factory.createFilter(); filter.apply("photo.jpg");

