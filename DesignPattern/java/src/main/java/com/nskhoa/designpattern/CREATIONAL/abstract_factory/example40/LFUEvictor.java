package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class LFUEvictor implements Evictor {
    public void evict(String key) {
        System.out.println("LFU Evicted: " + key);
    }
}
