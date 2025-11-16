package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example87;

public interface KeyManagementAbstractFactory {
    Manager createManager();

    Rotator createRotator();
}
