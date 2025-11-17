package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class SlidingWindowFactory implements RateLimiterAbstractFactory {
    public Limiter createLimiter() {
        return new SlidingWindowLimiter();
    }

    public Enforcer createEnforcer() {
        return new SlidingWindowEnforcer();
    }
}
