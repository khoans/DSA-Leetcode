package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public abstract class ShippingHandler {
    protected ShippingHandler nextHandler;

    public void setNextHandler(ShippingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(ShippingRequest request);
}
