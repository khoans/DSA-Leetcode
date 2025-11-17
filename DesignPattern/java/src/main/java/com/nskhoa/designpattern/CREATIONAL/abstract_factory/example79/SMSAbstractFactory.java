package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public interface SMSAbstractFactory {
    Gateway createGateway();

    Formatter createFormatter();
}

