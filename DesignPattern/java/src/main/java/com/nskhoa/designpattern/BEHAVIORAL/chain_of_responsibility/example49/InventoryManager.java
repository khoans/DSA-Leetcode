package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public class InventoryManager extends SupplyChainHandler {
    @Override
    public void handle(Order order) {
        System.out.println("Managing inventory for order " + order.getId());
        order.setInventoryManaged(true);
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
