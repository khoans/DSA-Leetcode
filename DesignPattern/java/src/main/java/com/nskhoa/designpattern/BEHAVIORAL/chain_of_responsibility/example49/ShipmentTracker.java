package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public class ShipmentTracker extends SupplyChainHandler {
    @Override
    public void handle(Order order) {
        System.out.println("Tracking shipment for order " + order.getId());
        order.setShipmentTracked(true);
    }
}
