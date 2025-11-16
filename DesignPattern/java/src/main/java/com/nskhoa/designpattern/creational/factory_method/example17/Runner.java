package com.nskhoa.designpattern.creational.factory_method.example17;

import com.nskhoa.designpattern.creational.factory_method.example17.factory.Cache;
import com.nskhoa.designpattern.creational.factory_method.example17.factory.CacheFactory;
import com.nskhoa.designpattern.creational.factory_method.example17.factory.memory.InMemoryFactory;
import com.nskhoa.designpattern.creational.factory_method.example17.factory.redis.RedisFactory;

public class Runner {
    public static void main(String[] args) {
        CacheFactory redisFactory = new RedisFactory();
        Cache redisCache = redisFactory.createCache();
        redisCache.store("userId", "12345");

        CacheFactory memcachedFactory = new InMemoryFactory();
        memcachedFactory.createCache();
        Cache memcachedCache = memcachedFactory.createCache();
        memcachedCache.store("sessionId", "abcde");
    }
}
