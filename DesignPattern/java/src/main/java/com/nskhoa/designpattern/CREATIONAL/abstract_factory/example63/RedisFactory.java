package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class RedisFactory implements CacheLoaderAbstractFactory {
    public Loader createLoader() {
        return new RedisLoader();
    }

    public Expirer createExpirer() {
        return new RedisExpirer();
    }
}
