package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class MemcachedCache {
    void memcachedPut(String key, String val) {
        System.out.println("Memcached cached " + key);
    }
    String memcachedGet(String key) {
        return "Memcached:" + key;
    }
}
