package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public class StripeFactory implements PaymentAbstractFactory {
    public Processor createProcessor() {
        return new StripeProcessor();
    }

    public Validator createValidator() {
        return new StripeValidator();
    }
}
