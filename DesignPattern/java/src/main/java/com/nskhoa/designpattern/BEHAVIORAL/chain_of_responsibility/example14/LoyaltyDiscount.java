package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

public class LoyaltyDiscount extends DiscountHandler {
    @Override
    public void applyDiscount(Order order) {
        order.addDiscount(5);
        System.out.println("Loyalty discount applied: $5");
        if (next != null) {
            next.applyDiscount(order);
        }
    }
}
