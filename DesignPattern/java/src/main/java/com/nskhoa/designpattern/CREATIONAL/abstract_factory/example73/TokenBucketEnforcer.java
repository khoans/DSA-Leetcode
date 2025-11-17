package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class TokenBucketEnforcer implements Enforcer {
    public void enforce(String action) {
        System.out.println("Token Bucket Enforced: " + action);
    }
}
