package com.nskhoa.designpattern.creational.abstract_factory.example87;

public interface KeyManagementAbstractFactory {
    Manager createManager();

    Rotator createRotator();
}
