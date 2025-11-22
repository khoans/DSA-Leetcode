package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

public class InventoryUpdater extends ReturnHandler {
    @Override
    public void handle(ReturnRequest request) {
        System.out.println("Updating inventory for order " + request.getOrderId());
        request.setInventoryUpdated(true);
    }
}
