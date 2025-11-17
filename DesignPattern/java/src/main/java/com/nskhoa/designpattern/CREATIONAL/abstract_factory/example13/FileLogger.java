package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File Log: " + message);
    }
}
