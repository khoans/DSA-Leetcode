package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public abstract class FinanceClient {
    protected TransactionProcessor processor;
    protected FinanceClient(TransactionProcessor processor) { this.processor = processor; }
    abstract void executeTransaction(String transactionId);
}
