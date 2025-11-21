package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class InMemoryCache implements Cache {
    public void put(String key, String value) {
        System.out.println("In-Memory Put: " + key + "=" + value);
    }
}
