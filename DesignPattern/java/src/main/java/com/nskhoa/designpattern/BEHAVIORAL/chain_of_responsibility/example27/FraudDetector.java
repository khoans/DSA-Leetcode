package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

// Concrete Handlers
public class FraudDetector extends PaymentProcessor {
    @Override
    public void process(PaymentRequest request) {
        if (!request.isFlaggedFraud()) {
            System.out.println("Fraud detection passed.");
            if (nextProcessor != null) {
                nextProcessor.process(request);
            }
        }
        else {
            System.out.println("Payment flagged as fraud. Stopped processing.");
        }
    }
}
