package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class LoggingWeaver implements Weaver {
    public void weave(String code) {
        System.out.println("Logging Woven: " + code);
    }
}
