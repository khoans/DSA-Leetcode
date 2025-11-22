package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

// Request class
public class PaymentRequest {
    private double amount;
    private boolean flaggedFraud;

    public PaymentRequest(double amount, boolean flaggedFraud) {
        this.amount = amount;
        this.flaggedFraud = flaggedFraud;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isFlaggedFraud() {
        return flaggedFraud;
    }
}
