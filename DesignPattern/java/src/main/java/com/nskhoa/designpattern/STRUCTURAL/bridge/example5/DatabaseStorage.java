package com.nskhoa.designpattern.STRUCTURAL.bridge.example5;

public class DatabaseStorage implements LogStorage {
    public void logMessage(String message) {
        System.out.println("Logging to database: " + message);
    }
}
