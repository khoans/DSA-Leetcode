package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public abstract class TransactionProcessor {
    protected TransactionProcessor nextProcessor;

    public void setNextProcessor(TransactionProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(Transaction transaction);
}
