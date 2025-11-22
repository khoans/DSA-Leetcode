package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public abstract class FraudDetector {
    protected FraudDetector nextDetector;

    public void setNextDetector(FraudDetector nextDetector) {
        this.nextDetector = nextDetector;
    }

    public abstract void detect(Transaction transaction);
}
