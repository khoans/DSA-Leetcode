package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public class Runner {
    public static void main(String[] args) {
        TestingAbstractFactory factory = new UnitFactory();
        Mocker mocker = factory.createMocker();
        Verifier verifier = factory.createVerifier();

        mocker.mock("getData");
        boolean isVerified = verifier.verify("someResult");
        System.out.println("Verification: " + isVerified);
    }
}
