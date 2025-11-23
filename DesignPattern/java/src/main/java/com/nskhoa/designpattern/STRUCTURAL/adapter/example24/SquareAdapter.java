package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class SquareAdapter implements PaymentProcessor {
    private SquareProcessor square = new SquareProcessor();

    public void processPayment(double amount) {
        square.squarePay(amount);
    }
}
