package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public class FraudDetectionDemo {
    public static void main(String[] args) {
        FraudDetector patternAnalyzer = new PatternAnalyzer();
        FraudDetector activityFlagger = new SuspiciousActivityFlagger();
        FraudDetector escalationHandler = new EscalationHandler();

        patternAnalyzer.setNextDetector(activityFlagger);
        activityFlagger.setNextDetector(escalationHandler);

        Transaction transaction = new Transaction(6000);
        patternAnalyzer.detect(transaction);
    }
}

