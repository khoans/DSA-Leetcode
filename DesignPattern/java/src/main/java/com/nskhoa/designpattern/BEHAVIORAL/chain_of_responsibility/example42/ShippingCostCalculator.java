package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public class ShippingCostCalculator extends ShippingHandler {
    @Override
    public void handle(ShippingRequest request) {
        System.out.println("Shipping cost calculated for weight: " + request.getPackageWeight());
        request.setCostsCalculated(true);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
