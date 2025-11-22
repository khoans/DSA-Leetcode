package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public class FraudDetector extends TransactionProcessor {
    @Override
    public void process(Transaction transaction) {
        if (!transaction.isFraudulent()) {
            System.out.println("Fraud check passed.");
            if (nextProcessor != null) {
                nextProcessor.process(transaction);
            }
        }
        else {
            System.out.println("Transaction flagged as fraud.");
        }
    }
}
