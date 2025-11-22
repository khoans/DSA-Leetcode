package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public abstract class MarketingHandler {
    protected MarketingHandler nextHandler;

    public void setNextHandler(MarketingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void process(Campaign campaign);
}
