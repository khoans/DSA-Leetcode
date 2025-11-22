package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

// Concrete Handlers
public class InventoryCheckHandler extends FulfillmentHandler {
    @Override
    public void fulfill(Order order) {
        System.out.println("Checking inventory for order " + order.getId());
        order.setInventoryChecked(true);
        if (nextHandler != null) {
            nextHandler.fulfill(order);
        }
    }
}
