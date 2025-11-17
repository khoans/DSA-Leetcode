package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public interface PaymentAbstractFactory {
    Processor createProcessor();

    Validator createValidator();
}

// Usage: PaymentAbstractFactory factory = new StripeFactory(); Processor proc = factory.createProcessor(); proc.process(50.0);

