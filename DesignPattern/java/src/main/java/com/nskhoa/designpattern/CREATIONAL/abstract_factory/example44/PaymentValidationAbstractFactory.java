package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

public interface PaymentValidationAbstractFactory {
    Validator createValidator();

    Processor createProcessor();
}
