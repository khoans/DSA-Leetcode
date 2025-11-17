package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class SyncBreaker implements Breaker {
    public boolean allowCall(String service) {
        return true;
    }
}
