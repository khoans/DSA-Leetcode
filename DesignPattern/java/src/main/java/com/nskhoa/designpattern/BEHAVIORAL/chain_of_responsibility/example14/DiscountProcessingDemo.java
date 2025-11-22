package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

// Client runner
public class DiscountProcessingDemo {
    public static void main(String[] args) {
        DiscountHandler seasonal = new SeasonalDiscount();
        DiscountHandler loyalty = new LoyaltyDiscount();
        DiscountHandler coupon = new CouponDiscount();

        seasonal.setNext(loyalty);
        loyalty.setNext(coupon);

        Order order = new Order(150);
        seasonal.applyDiscount(order);
        System.out.println("Total discount: $" + order.getDiscount());
    }
}
