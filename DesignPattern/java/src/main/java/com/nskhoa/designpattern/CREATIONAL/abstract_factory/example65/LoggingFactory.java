package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class LoggingFactory implements AOPAbstractFactory {
    public Aspect createAspect() {
        return new LoggingAspect();
    }

    public Weaver createWeaver() {
        return new LoggingWeaver();
    }
}
