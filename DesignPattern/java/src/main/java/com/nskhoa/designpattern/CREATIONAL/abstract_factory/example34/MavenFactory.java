package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

public class MavenFactory implements BuildAbstractFactory {
    public Builder createBuilder() {
        return new MavenBuilder();
    }

    public Tester createTester() {
        return new MavenTester();
    }
}
