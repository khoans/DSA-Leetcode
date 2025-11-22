package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public abstract class SupplyChainHandler {
    protected SupplyChainHandler nextHandler;

    public void setNextHandler(SupplyChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Order order);
}
