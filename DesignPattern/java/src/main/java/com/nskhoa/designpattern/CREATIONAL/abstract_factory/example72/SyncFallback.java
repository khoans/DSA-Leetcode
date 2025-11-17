package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class SyncFallback implements Fallback {
    public String fallback(String service) {
        return "Sync Fallback for " + service;
    }
}
