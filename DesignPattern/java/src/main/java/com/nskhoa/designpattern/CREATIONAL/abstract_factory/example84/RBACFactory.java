package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public class RBACFactory implements AccessControlAbstractFactory {
    public Controller createController() { return new RBACController(); }
    public Enforcer createEnforcer() { return new RBACEnforcer(); }
}
