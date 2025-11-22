package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

public class CreditLimitChecker extends PaymentProcessor {
    @Override
    public void process(PaymentRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Credit limit check passed.");
            if (nextProcessor != null) {
                nextProcessor.process(request);
            }
        }
        else {
            System.out.println("Credit limit exceeded. Payment declined.");
        }
    }
}
