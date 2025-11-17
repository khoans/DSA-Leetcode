package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public class RBACEnforcer implements Enforcer {
    public void enforce(String resource) {
        System.out.println("RBAC " +
                           "Enforced: " + resource);
    }
}
