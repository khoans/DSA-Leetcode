package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public class SuspiciousActivityFlagger extends FraudDetector {
    @Override
    public void detect(Transaction transaction) {
        if (transaction.isSuspicious()) {
            System.out.println("SuspiciousActivityFlagger: Transaction flagged as suspicious.");
        }
        if (nextDetector != null) {
            nextDetector.detect(transaction);
        }
    }
}
