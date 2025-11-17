package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class AsyncFactory implements CircuitBreakerAbstractFactory {
    public Breaker createBreaker() {
        return new AsyncBreaker();
    }

    public Fallback createFallback() {
        return new AsyncFallback();
    }
}
