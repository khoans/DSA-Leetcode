package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

// Abstract Handler
public abstract class Middleware {
    protected Middleware next;

    public void setNext(Middleware next) {
        this.next = next;
    }

    public abstract void handle(Request request);
}
