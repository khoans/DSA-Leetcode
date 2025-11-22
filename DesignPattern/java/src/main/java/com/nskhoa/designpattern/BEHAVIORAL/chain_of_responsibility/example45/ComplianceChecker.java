package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public class ComplianceChecker extends TransactionProcessor {
    @Override
    public void process(Transaction transaction) {
        if (transaction.isCompliant()) {
            System.out.println("Compliance check passed.");
            if (nextProcessor != null) {
                nextProcessor.process(transaction);
            }
        }
        else {
            System.out.println("Transaction failed compliance check.");
        }
    }
}
