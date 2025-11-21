package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class LoggingAspect implements Aspect {
    public void apply(String method) {
        System.out.println("Logging Applied to " + method);
    }
}
