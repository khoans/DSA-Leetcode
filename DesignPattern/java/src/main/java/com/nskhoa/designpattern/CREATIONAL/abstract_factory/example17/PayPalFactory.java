package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public class PayPalFactory implements PaymentAbstractFactory {
    public Processor createProcessor() {
        return new PayPalProcessor();
    }

    public Validator createValidator() {
        return new PayPalValidator();
    }
}
