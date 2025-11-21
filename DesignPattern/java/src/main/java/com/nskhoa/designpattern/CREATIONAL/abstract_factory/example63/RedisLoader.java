package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class RedisLoader implements Loader {
    public void load(String key) {
        System.out.println("Redis Loaded: " + key);
    }
}
