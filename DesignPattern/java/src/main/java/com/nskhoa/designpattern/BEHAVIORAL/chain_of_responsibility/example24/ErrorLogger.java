package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

// Abstract Handler
public abstract class ErrorLogger {
    protected ErrorLogger nextLogger;

    public void setNextLogger(ErrorLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(Error error);
}
