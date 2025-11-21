package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class DistributedCache implements Cache {
    public void put(String key, String value) {
        System.out.println("Distributed Put: " + key + "=" + value);
    }
}
