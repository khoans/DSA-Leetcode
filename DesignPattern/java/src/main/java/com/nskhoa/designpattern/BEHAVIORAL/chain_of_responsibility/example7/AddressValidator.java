package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

// Concrete Handlers
public class AddressValidator extends OrderValidator {
    @Override
    public void validate(Order order) {
        System.out.println("Address validated for order " + order.getOrderId());
        if (nextValidator != null) {
            nextValidator.validate(order);
        }
    }
}
