package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class AsyncFallback implements Fallback {
    public String fallback(String service) {
        return "Async Fallback for " + service;
    }
}
