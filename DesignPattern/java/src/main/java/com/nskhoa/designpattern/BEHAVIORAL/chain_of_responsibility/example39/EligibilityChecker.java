package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

// Concrete Handlers
public class EligibilityChecker extends ReturnHandler {
    @Override
    public void handle(ReturnRequest request) {
        if (request.isEligible()) {
            System.out.println("Return eligible for order " + request.getOrderId());
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
        else {
            System.out.println("Return denied for order " + request.getOrderId());
        }
    }
}
