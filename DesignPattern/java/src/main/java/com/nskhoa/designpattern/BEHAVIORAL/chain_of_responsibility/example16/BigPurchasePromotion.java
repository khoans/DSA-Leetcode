package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

public class BigPurchasePromotion extends PromotionChecker {
    @Override
    public void checkPromotion(Customer customer) {
        if (customer.getPurchaseAmount() > 1000) {
            System.out.println("Applied big purchase promotion");
        }
        else if (nextChecker != null) {
            nextChecker.checkPromotion(customer);
        }
    }
}
