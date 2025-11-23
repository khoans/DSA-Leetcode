package com.nskhoa.designpattern.STRUCTURAL.bridge.example5;

public abstract class Logger {
    protected LogStorage storage;

    Logger(LogStorage storage) {
        this.storage = storage;
    }

    abstract void log(String message);
}
