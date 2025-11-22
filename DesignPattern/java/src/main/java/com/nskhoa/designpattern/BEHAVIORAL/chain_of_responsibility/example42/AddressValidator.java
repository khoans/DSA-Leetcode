package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public class AddressValidator extends ShippingHandler {
    @Override
    public void handle(ShippingRequest request) {
        if (request.getAddress() != null && !request
                .getAddress()
                .isEmpty()) {
            System.out.println("Address validated.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
        else {
            System.out.println("Invalid address.");
        }
    }
}
