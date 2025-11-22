package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public abstract class DRMHandler {
    protected DRMHandler nextHandler;

    public void setNextHandler(DRMHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(ContentRequest request);
}
