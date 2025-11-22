package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

// Abstract Handler
public abstract class ExceptionHandler {
    protected ExceptionHandler nextHandler;

    public void setNextHandler(ExceptionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(ExceptionRequest request);
}
