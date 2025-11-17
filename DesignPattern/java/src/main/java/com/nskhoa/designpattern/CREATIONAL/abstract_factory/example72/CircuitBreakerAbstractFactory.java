package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public interface CircuitBreakerAbstractFactory {
    Breaker createBreaker();

    Fallback createFallback();
}

