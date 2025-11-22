package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

// Client runner
public class PromotionEligibilityDemo {
    public static void main(String[] args) {
        PromotionChecker newCustomer = new NewCustomerPromotion();
        PromotionChecker bigPurchase = new BigPurchasePromotion();
        PromotionChecker defaultPromo = new DefaultPromotion();

        newCustomer.setNextChecker(bigPurchase);
        bigPurchase.setNextChecker(defaultPromo);

        Customer c1 = new Customer(true, 500);
        Customer c2 = new Customer(false, 1500);
        Customer c3 = new Customer(false, 200);

        newCustomer.checkPromotion(c1);
        newCustomer.checkPromotion(c2);
        newCustomer.checkPromotion(c3);
    }
}

