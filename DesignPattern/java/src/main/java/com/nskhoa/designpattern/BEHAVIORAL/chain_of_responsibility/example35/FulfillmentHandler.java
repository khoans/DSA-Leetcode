package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

// Abstract Handler
public abstract class FulfillmentHandler {
    protected FulfillmentHandler nextHandler;

    public void setNextHandler(FulfillmentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void fulfill(Order order);
}
