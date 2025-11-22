package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

public class PackagingHandler extends FulfillmentHandler {
    @Override
    public void fulfill(Order order) {
        System.out.println("Packaging order " + order.getId());
        order.setPackaged(true);
    }
}
