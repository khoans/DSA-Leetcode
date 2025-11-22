package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public abstract class NetworkRequestHandler {
    protected NetworkRequestHandler nextHandler;

    public void setNextHandler(NetworkRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(NetworkRequest request);
}
