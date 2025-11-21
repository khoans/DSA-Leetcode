package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

public interface BuildAbstractFactory {
    Builder createBuilder();

    Tester createTester();
}
