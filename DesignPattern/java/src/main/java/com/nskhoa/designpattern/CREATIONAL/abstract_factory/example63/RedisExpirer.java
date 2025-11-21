package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class RedisExpirer implements Expirer {
    public void expire(String key) {
        System.out.println("Redis Expired: " + key);
    }
}
