package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class EhcacheExpirer implements Expirer {
    public void expire(String key) {
        System.out.println("Ehcache Expired: " + key);
    }
}
