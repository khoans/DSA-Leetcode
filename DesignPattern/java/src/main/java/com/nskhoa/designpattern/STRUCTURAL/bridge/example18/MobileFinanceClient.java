package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public class MobileFinanceClient extends FinanceClient {
    public MobileFinanceClient(TransactionProcessor processor) { super(processor); }
    public void executeTransaction(String transactionId) {
        System.out.print("Mobile UI: ");
        processor.processTransaction(transactionId);
    }
}
