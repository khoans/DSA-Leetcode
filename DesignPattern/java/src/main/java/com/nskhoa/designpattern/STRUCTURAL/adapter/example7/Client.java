package com.nskhoa.designpattern.STRUCTURAL.adapter.example7;

public class Client {
    private Logger logger;

    public Client(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Doing something important...");
    }
}
