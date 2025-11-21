package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public interface AOPAbstractFactory {
    Aspect createAspect();

    Weaver createWeaver();
}

// Usage: AOPAbstractFactory factory = new LoggingFactory(); Aspect aspect = factory.createAspect(); aspect.apply("userService.save");

