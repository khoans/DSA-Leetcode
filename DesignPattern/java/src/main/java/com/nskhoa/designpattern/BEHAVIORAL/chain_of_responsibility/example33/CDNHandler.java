package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

// Abstract Handler
public abstract class CDNHandler {
    protected CDNHandler nextHandler;

    public void setNextHandler(CDNHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(ContentRequest request);
}
