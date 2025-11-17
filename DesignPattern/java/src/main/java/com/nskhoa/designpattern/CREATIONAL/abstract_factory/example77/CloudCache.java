package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class CloudCache implements Cache {
    public void store(String domain, String ip) {
        System.out.println("Cloud Cached: " + domain + " -> " + ip);
    }
}
