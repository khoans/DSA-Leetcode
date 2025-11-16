package com.nskhoa.designpattern.creational.factory_method.example17.factory.memory;

import com.nskhoa.designpattern.creational.factory_method.example17.factory.Cache;

public class InMemoryCache implements Cache {
    public void store(String key, String value) {
        System.out.println("In-Memory Stored: " + key + "=" + value);
    }
}

