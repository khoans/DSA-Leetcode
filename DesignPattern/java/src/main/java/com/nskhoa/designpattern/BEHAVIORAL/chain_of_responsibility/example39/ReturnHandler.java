package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

// Abstract Handler
public abstract class ReturnHandler {
    protected ReturnHandler nextHandler;

    public void setNextHandler(ReturnHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(ReturnRequest request);
}
