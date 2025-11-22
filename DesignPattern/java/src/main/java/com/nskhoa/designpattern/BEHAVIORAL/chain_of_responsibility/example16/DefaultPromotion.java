package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

public class DefaultPromotion extends PromotionChecker {
    @Override
    public void checkPromotion(Customer customer) {
        System.out.println("Applied default promotion");
    }
}
