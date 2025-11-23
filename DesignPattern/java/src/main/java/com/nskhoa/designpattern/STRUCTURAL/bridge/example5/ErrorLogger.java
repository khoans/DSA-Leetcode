package com.nskhoa.designpattern.STRUCTURAL.bridge.example5;

public class ErrorLogger extends Logger {
    ErrorLogger(LogStorage storage) {
        super(storage);
    }

    public void log(String message) {
        storage.logMessage("ERROR: " + message);
    }
}
