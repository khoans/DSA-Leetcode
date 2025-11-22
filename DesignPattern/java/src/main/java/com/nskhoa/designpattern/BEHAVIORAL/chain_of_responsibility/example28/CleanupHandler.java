package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example28;

// Abstract Handler
public abstract class CleanupHandler {
    protected CleanupHandler nextHandler;

    public void setNextHandler(CleanupHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void cleanup();
}
