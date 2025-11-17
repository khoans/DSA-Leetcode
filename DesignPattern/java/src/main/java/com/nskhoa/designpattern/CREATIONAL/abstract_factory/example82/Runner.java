package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public class Runner {
    public static void main(String[] args) {
        FraudDetectionAbstractFactory factory = new MLFactory();
        Detector detector = factory.createDetector();
        Alertor alertor = factory.createAlertor();

        String transaction = "Sample Transaction";
        if (detector.detect(transaction)) {
            alertor.alert("Fraud detected in transaction: " + transaction);
        }
    }
}
