package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

public class CouponDiscount extends DiscountHandler {
    @Override
    public void applyDiscount(Order order) {
        order.addDiscount(7);
        System.out.println("Coupon discount applied: $7");
        if (next != null) {
            next.applyDiscount(order);
        }
    }
}
