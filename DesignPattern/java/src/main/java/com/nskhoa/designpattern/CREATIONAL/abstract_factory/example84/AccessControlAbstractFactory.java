package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public interface AccessControlAbstractFactory {
    Controller createController();
    Enforcer createEnforcer();
}

