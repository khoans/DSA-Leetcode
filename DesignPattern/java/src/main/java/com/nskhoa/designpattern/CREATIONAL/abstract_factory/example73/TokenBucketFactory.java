package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class TokenBucketFactory implements RateLimiterAbstractFactory {
    public Limiter createLimiter() {
        return new TokenBucketLimiter();
    }

    public Enforcer createEnforcer() {
        return new TokenBucketEnforcer();
    }
}
