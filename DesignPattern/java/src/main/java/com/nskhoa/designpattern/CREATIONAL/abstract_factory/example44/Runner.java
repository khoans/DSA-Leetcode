package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

// Usage: PaymentValidationAbstractFactory factory = new CreditFactory(); Validator val = factory.createValidator(); val.validate("1234");
public class Runner {
    public static void main(String[] args) {
        PaymentValidationAbstractFactory factory = new CreditFactory();
        Validator validator = factory.createValidator();
        Processor processor = factory.createProcessor();

        if (validator.validate("1234-5678-9012-3456")) {
            processor.process(100.0);
        }
    }
}
