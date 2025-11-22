package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

// Abstract Handler
public abstract class IoTCommandHandler {
    protected IoTCommandHandler nextHandler;

    public void setNextHandler(IoTCommandHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(IoTCommand command);
}
