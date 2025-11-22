package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public class SupplierCoordinator extends SupplyChainHandler {
    @Override
    public void handle(Order order) {
        System.out.println("Coordinating suppliers for order " + order.getId());
        order.setSupplierCoordinated(true);
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
