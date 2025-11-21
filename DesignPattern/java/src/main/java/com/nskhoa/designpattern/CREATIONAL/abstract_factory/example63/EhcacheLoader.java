package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class EhcacheLoader implements Loader {
    public void load(String key) {
        System.out.println("Ehcache Loaded: " + key);
    }
}
