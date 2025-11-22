package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

// Abstract Handler
public abstract class DiscountHandler {
    protected DiscountHandler next;

    public void setNext(DiscountHandler next) {
        this.next = next;
    }

    public abstract void applyDiscount(Order order);
}
