package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class MemcachedAdapter implements CacheService {
    private MemcachedCache memcached = new MemcachedCache();
    public void put(String key, String value) { memcached.memcachedPut(key, value); }
    public String get(String key) { return memcached.memcachedGet(key); }
}
