package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class LocalCache implements Cache {
    public void store(String domain, String ip) {
        System.out.println("Local Cached: " + domain + " -> " + ip);
    }
}
