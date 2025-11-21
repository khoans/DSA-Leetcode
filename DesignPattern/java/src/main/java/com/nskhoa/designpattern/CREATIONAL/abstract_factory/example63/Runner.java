package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

// Usage: CacheLoaderAbstractFactory factory = new RedisFactory(); Loader loader = factory.createLoader(); loader.load("user.profile");
public class Runner {
    public static void main(String[] args) {
        CacheLoaderAbstractFactory factory = new RedisFactory();
        Loader loader = factory.createLoader();
        Expirer expirer = factory.createExpirer();

        loader.load("user.profile");
        expirer.expire("user.profile");
    }
}
