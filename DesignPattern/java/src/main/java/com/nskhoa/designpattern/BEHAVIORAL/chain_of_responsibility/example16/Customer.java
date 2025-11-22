package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

// Request class
public class Customer {
    private boolean isNewCustomer;
    private int purchaseAmount;

    public Customer(boolean isNewCustomer, int purchaseAmount) {
        this.isNewCustomer = isNewCustomer;
        this.purchaseAmount = purchaseAmount;
    }

    public boolean isNewCustomer() {
        return isNewCustomer;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }
}
