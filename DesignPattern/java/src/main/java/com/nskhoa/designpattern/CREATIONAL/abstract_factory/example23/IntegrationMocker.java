package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public class IntegrationMocker implements Mocker {
    public void mock(String method) {
        System.out.println("Integration Mocked: " + method);
    }
}
