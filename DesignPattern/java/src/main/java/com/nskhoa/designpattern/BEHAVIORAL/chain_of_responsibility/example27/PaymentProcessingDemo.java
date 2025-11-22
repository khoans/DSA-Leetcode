package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example27;

// Client runner
public class PaymentProcessingDemo {
    public static void main(String[] args) {
        PaymentProcessor fraudDetector = new FraudDetector();
        PaymentProcessor creditChecker = new CreditLimitChecker();
        PaymentProcessor recorder = new TransactionRecorder();

        fraudDetector.setNextProcessor(creditChecker);
        creditChecker.setNextProcessor(recorder);

        PaymentRequest req1 = new PaymentRequest(4000, false);
        PaymentRequest req2 = new PaymentRequest(6000, false);
        PaymentRequest req3 = new PaymentRequest(3000, true);

        System.out.println("Processing req1:");
        fraudDetector.process(req1);

        System.out.println("\nProcessing req2:");
        fraudDetector.process(req2);

        System.out.println("\nProcessing req3:");
        fraudDetector.process(req3);
    }
}

