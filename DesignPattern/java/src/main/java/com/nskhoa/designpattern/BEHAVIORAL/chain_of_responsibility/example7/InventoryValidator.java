package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

public class InventoryValidator extends OrderValidator {
    @Override
    public void validate(Order order) {
        System.out.println("Inventory checked for order " + order.getOrderId());
        if (nextValidator != null) {
            nextValidator.validate(order);
        }
    }
}
