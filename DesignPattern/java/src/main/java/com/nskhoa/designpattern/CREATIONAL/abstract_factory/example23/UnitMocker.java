package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example23;

public class UnitMocker implements Mocker {
    public void mock(String method) {
        System.out.println("Unit Mocked: " + method);
    }
}
