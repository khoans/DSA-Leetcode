package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class SyncFactory implements CircuitBreakerAbstractFactory {
    public Breaker createBreaker() {
        return new SyncBreaker();
    }

    public Fallback createFallback() {
        return new SyncFallback();
    }
}
