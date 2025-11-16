package com.nskhoa.designpattern.creational.factory_method.example17.factory.redis;

import com.nskhoa.designpattern.creational.factory_method.example17.factory.Cache;

public class RedisCache implements Cache {
    @Override
    public void store(String key, String value) {
        System.out.println("Redis Stored: " + key + "=" + value);
    }
}
