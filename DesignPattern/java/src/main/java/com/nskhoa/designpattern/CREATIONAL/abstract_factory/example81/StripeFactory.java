package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example81;

public class StripeFactory implements PaymentProcessorAbstractFactory {
    public Processor createProcessor() {
        return new StripeProcessor();
    }

    public Validator createValidator() {
        return new StripeValidator();
    }
}
