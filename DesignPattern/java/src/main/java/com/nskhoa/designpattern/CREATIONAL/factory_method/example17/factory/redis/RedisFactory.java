package com.nskhoa.designpattern.creational.factory_method.example17.factory.redis;

import com.nskhoa.designpattern.creational.factory_method.example17.factory.Cache;
import com.nskhoa.designpattern.creational.factory_method.example17.factory.CacheFactory;

public class RedisFactory extends CacheFactory {
    public Cache createCache() {
        return new RedisCache();
    }
}
