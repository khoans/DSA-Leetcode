package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public class Runner {
    public static void main(String[] args) {
        PaymentAbstractFactory factory = new StripeFactory();
        Processor processor = factory.createProcessor();
        Validator validator = factory.createValidator();

        if (validator.validate("card_info")) {
            processor.process(100.0);
        }
    }
}
