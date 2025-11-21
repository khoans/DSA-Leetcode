package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

public class GradleFactory implements BuildAbstractFactory {
    public Builder createBuilder() {
        return new GradleBuilder();
    }

    public Tester createTester() {
        return new GradleTester();
    }
}
