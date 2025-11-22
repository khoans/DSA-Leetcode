package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public abstract class BookingHandler {
    protected BookingHandler nextHandler;

    public void setNextHandler(BookingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(BookingRequest request);
}
