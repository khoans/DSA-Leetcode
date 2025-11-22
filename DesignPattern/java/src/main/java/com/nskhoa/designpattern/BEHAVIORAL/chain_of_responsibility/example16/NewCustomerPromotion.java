package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example16;

// Concrete Handlers
public class NewCustomerPromotion extends PromotionChecker {
    @Override
    public void checkPromotion(Customer customer) {
        if (customer.isNewCustomer()) {
            System.out.println("Applied new customer promotion");
        }
        else if (nextChecker != null) {
            nextChecker.checkPromotion(customer);
        }
    }
}
