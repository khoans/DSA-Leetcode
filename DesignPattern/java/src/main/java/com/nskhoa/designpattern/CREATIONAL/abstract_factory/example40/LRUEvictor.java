package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class LRUEvictor implements Evictor {
    public void evict(String key) {
        System.out.println("LRU Evicted: " + key);
    }
}
