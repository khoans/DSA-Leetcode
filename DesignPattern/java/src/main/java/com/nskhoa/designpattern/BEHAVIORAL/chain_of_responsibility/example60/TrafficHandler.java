package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example60;

public abstract class TrafficHandler {
    protected TrafficHandler nextHandler;

    public void setNextHandler(TrafficHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(TrafficData data);
}
