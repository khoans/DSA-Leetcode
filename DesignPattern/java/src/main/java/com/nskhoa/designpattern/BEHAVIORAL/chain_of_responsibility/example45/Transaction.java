package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public class Transaction {
    private double amount;
    private boolean isFraudulent;
    private boolean compliant;

    public Transaction(double amount, boolean isFraudulent, boolean compliant) {
        this.amount = amount;
        this.isFraudulent = isFraudulent;
        this.compliant = compliant;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    public boolean isCompliant() {
        return compliant;
    }
}
