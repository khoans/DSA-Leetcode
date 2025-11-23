package com.nskhoa.designpattern.STRUCTURAL.bridge.example5;

public class FileStorage implements LogStorage {
    public void logMessage(String message) {
        System.out.println("Logging to file: " + message);
    }
}
