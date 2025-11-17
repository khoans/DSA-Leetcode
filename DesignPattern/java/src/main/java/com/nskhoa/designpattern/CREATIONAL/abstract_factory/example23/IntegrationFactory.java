package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public class IntegrationFactory implements TestingAbstractFactory {
    public Mocker createMocker() {
        return new IntegrationMocker();
    }

    public Verifier createVerifier() {
        return new IntegrationVerifier();
    }
}
