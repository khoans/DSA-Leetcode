package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example51;

public class Transaction {
    private double amount;
    private boolean suspicious;
    private boolean escalated;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuspicious() {
        return suspicious;
    }

    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }

    public boolean isEscalated() {
        return escalated;
    }

    public void setEscalated(boolean escalated) {
        this.escalated = escalated;
    }
}
