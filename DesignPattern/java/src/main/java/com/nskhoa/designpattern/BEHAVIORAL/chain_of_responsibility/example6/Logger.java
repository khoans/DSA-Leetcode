package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example6;

// Abstract Handler
public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void logMessage(int level, String message);
}
