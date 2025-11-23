package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public class BankAProcessor implements TransactionProcessor {
    public void processTransaction(String transactionId) {
        System.out.println("BankA processed transaction: " + transactionId);
    }
}
