package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

public class CreditFactory implements PaymentValidationAbstractFactory {
    public Validator createValidator() {
        return new CreditValidator();
    }

    public Processor createProcessor() {
        return new CreditProcessor();
    }
}
