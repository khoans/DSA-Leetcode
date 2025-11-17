package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public class UnitFactory implements TestingAbstractFactory {
    public Mocker createMocker() {
        return new UnitMocker();
    }

    public Verifier createVerifier() {
        return new UnitVerifier();
    }
}
