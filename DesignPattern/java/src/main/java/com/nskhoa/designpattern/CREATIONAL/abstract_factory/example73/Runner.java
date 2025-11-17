package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class Runner {
    public static void main(String[] args) {
        RateLimiterAbstractFactory factory = new TokenBucketFactory();
        Limiter limiter = factory.createLimiter();
        Enforcer enforcer = factory.createEnforcer();

        if (limiter.acquire("user1")) {
            enforcer.enforce("Allow request for user1");
        }
        else {
            enforcer.enforce("Deny request for user1");
        }
    }
}
