package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public class ABACEnforcer implements Enforcer {
    public void enforce(String resource) {
        System.out.println("ABAC " +
                           "Enforced: " + resource);
    }
}
