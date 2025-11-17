package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example81;

public class Runner {
    public static void main(String[] args) {
        PaymentProcessorAbstractFactory factory = new StripeFactory();
        Processor processor = factory.createProcessor();
        Validator validator = factory.createValidator();

        if (validator.validate("card-info")) {
            processor.process(100.0);
        }
    }
}
