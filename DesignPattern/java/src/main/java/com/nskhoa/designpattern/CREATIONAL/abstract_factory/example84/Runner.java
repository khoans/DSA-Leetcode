package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example84;

public class Runner {
    public static void main(String[] args) {
        AccessControlAbstractFactory factory = new ABACTFactory();
        Controller controller = factory.createController();
        Enforcer enforcer = factory.createEnforcer();

        String user = "Alice";
        String resource = "Document1";

        if (controller.checkRole(user)) {
            enforcer.enforce(resource);
            System.out.println("Access granted to " + user + " for " + resource);
        } else {
            System.out.println("Access denied to " + user + " for " + resource);
        }
    }
}
