package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

public class PaymentProcessingHandler extends FulfillmentHandler {
    @Override
    public void fulfill(Order order) {
        System.out.println("Processing payment for order " + order.getId());
        order.setPaymentProcessed(true);
        if (nextHandler != null) {
            nextHandler.fulfill(order);
        }
    }
}
