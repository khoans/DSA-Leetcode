package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public class EscalationHandler extends FraudDetector {
    @Override
    public void detect(Transaction transaction) {
        if (transaction.isSuspicious()) {
            transaction.setEscalated(true);
            System.out.println("EscalationHandler: Transaction escalated for review.");
        }
    }
}
