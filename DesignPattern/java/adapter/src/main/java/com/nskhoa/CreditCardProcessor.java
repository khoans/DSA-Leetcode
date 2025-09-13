package com.nskhoa;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
