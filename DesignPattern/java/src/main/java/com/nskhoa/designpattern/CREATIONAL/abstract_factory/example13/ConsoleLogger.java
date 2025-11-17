package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}
