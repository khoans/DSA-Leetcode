package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public interface TestingAbstractFactory {
    Mocker createMocker();

    Verifier createVerifier();
}

// Usage: TestingAbstractFactory factory = new UnitFactory(); Mocker mocker = factory.createMocker(); mocker.mock("getData");

