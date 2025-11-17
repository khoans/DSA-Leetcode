package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example81;

public class PayPalFactory implements PaymentProcessorAbstractFactory {
    public Processor createProcessor() {
        return new PayPalProcessor();
    }

    public Validator createValidator() {
        return new PayPalValidator();
    }
}
