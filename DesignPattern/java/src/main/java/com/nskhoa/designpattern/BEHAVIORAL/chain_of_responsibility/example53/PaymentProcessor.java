package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public class PaymentProcessor extends BookingHandler {
    @Override
    public void handle(BookingRequest request) {
        System.out.println("Payment processed.");
        request.setPaymentDone(true);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
