package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example81;

public interface PaymentProcessorAbstractFactory {
    Processor createProcessor();

    Validator createValidator();
}

