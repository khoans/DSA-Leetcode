package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

// Concrete Handlers
public class SeasonalDiscount extends DiscountHandler {
    @Override
    public void applyDiscount(Order order) {
        if (order.getPrice() > 100) {
            order.addDiscount(10);
            System.out.println("Seasonal discount applied: $10");
        }
        if (next != null) {
            next.applyDiscount(order);
        }
    }
}
