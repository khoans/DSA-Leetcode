package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

// Abstract Handler
public abstract class PaymentProcessor {
    protected PaymentProcessor nextProcessor;

    public void setNextProcessor(PaymentProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(PaymentRequest request);
}
