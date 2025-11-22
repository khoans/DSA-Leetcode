package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

// Request class
public class CashRequest {
    private int amount;

    public CashRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
