package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example73;

public class SlidingWindowLimiter implements Limiter {
    public boolean acquire(String key) {
        return true;
    }
}
