package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

// Client runner
public class OrderFulfillmentDemo {
    public static void main(String[] args) {
        FulfillmentHandler inventory = new InventoryCheckHandler();
        FulfillmentHandler payment = new PaymentProcessingHandler();
        FulfillmentHandler packaging = new PackagingHandler();

        inventory.setNextHandler(payment);
        payment.setNextHandler(packaging);

        Order order = new Order("ORD1001");
        inventory.fulfill(order);
    }
}
