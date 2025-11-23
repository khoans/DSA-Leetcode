package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class Transaction {
    private final String id;
    private final double amount;

    Transaction(String id, double amount) {
        this.id = id; this.amount = amount;
    }

    String getId() {
        return id;
    }

    double getAmount() {
        return amount;
    }
}
