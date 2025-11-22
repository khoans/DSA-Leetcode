package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

public class TransactionRecorder extends PaymentProcessor {
    @Override
    public void process(PaymentRequest request) {
        System.out.println("Transaction recorded for amount: " + request.getAmount());
    }
}
