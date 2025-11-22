package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public class PatternAnalyzer extends FraudDetector {
    @Override
    public void detect(Transaction transaction) {
        if (transaction.getAmount() > 5000) {
            transaction.setSuspicious(true);
            System.out.println("PatternAnalyzer: Suspicious pattern detected.");
        }
        if (nextDetector != null) {
            nextDetector.detect(transaction);
        }
    }
}
