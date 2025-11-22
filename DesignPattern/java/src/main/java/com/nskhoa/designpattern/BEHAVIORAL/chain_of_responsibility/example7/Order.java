package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

// Request class
public class Order {
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
