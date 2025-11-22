package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

// Abstract Handler
public abstract class PromotionChecker {
    protected PromotionChecker nextChecker;

    public void setNextChecker(PromotionChecker nextChecker) {
        this.nextChecker = nextChecker;
    }

    public abstract void checkPromotion(Customer customer);
}
