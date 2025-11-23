package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class RedisCache {
    void redisPut(String key, String val) {
        System.out.println("Redis cached " + key);
    }
    String redisGet(String key) {
        return "Redis:" + key;
    }
}
