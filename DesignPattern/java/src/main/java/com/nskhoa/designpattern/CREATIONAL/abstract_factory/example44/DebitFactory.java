package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

public class DebitFactory implements PaymentValidationAbstractFactory {
    public Validator createValidator() {
        return new DebitValidator();
    }

    public Processor createProcessor() {
        return new DebitProcessor();
    }
}
