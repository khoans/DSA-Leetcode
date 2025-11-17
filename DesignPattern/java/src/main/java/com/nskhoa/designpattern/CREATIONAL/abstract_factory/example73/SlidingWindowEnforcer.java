package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class SlidingWindowEnforcer implements Enforcer {
    public void enforce(String action) {
        System.out.println("Sliding Window Enforced: " + action);
    }
}
