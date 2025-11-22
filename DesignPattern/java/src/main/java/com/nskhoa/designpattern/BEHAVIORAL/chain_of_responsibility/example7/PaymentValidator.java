package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

public class PaymentValidator extends OrderValidator {
    @Override
    public void validate(Order order) {
        System.out.println("Payment validated for order " + order.getOrderId());
        if (nextValidator != null) {
            nextValidator.validate(order);
        }
    }
}
