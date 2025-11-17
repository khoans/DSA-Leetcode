package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public interface RateLimiterAbstractFactory {
    Limiter createLimiter();

    Enforcer createEnforcer();
}

