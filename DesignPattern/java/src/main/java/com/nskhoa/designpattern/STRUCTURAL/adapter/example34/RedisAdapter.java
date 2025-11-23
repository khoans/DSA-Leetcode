package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class RedisAdapter implements CacheService {
    private RedisCache redis = new RedisCache();
    public void put(String key, String value) { redis.redisPut(key, value); }
    public String get(String key) { return redis.redisGet(key); }
}
