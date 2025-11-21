package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class SecurityAspect implements Aspect {
    public void apply(String method) {
        System.out.println("Security Applied to " + method);
    }
}
