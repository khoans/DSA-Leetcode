package com.nskhoa.designpattern.CREATIONAL.factory_method.example17.factory.memory;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example17.factory.Cache;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example17.factory.CacheFactory;

public class InMemoryFactory extends CacheFactory {
    public Cache createCache() {
        return new InMemoryCache();
    }
}
