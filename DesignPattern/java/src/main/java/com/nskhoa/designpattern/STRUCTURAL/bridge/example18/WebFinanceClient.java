package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public class WebFinanceClient extends FinanceClient {
    public WebFinanceClient(TransactionProcessor processor) { super(processor); }
    public void executeTransaction(String transactionId) {
        System.out.print("Web UI: ");
        processor.processTransaction(transactionId);
    }
}
