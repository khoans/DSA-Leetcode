package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public interface DocumentAbstractFactory {
    Generator createGenerator();

    Formatter createFormatter();
}
