package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public class ABACTFactory implements AccessControlAbstractFactory {
    public Controller createController() {
        return new ABACController();
    }

    public Enforcer createEnforcer() {
        return new ABACEnforcer();
    }
}
