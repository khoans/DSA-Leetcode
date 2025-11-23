package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public class BankBProcessor implements TransactionProcessor {
    public void processTransaction(String transactionId) {
        System.out.println("BankB processed transaction: " + transactionId);
    }
}
