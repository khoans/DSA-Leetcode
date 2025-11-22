package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public class PickupScheduler extends ShippingHandler {
    @Override
    public void handle(ShippingRequest request) {
        if (request.costsCalculated) {
            System.out.println("Pickup scheduled.");
            request.setPickupScheduled(true);
        }
        else {
            System.out.println("Cannot schedule pickup without cost calculation.");
        }
    }
}
