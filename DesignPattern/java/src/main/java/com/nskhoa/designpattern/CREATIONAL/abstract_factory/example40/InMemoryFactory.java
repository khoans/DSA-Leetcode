package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class InMemoryFactory implements CachingAbstractFactory {
    public Cache createCache() {
        return new InMemoryCache();
    }

    public Evictor createEvictor() {
        return new LRUEvictor();
    }
}
