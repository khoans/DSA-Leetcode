package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class SecurityFactory implements AOPAbstractFactory {
    public Aspect createAspect() {
        return new SecurityAspect();
    }

    public Weaver createWeaver() {
        return new SecurityWeaver();
    }
}
