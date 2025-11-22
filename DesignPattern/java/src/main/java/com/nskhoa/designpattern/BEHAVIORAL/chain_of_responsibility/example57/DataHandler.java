package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public abstract class DataHandler {
    protected DataHandler nextHandler;

    public void setNextHandler(DataHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Data data);
}
