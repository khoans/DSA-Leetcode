package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

// Abstract Handler
public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleTicket(SupportTicket ticket);
}
