package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

// Abstract Handler
public abstract class CashDispenser {
    protected CashDispenser nextDispenser;

    public void setNextDispenser(CashDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(CashRequest request);
}
