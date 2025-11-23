package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class Client {
    public static void main(String[] args) {
        CacheService cache;

        cache = new RedisAdapter();
        cache.put("key1", "value1");
        System.out.println(cache.get("key1"));

        cache = new MemcachedAdapter();
        cache.put("key2", "value2");
        System.out.println(cache.get("key2"));

        cache = new HazelcastAdapter();
        cache.put("key3", "value3");
        System.out.println(cache.get("key3"));
    }
}
