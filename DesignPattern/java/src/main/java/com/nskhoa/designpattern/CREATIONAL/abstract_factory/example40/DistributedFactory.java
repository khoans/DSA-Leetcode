package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public class DistributedFactory implements CachingAbstractFactory {
    public Cache createCache() {
        return new DistributedCache();
    }

    public Evictor createEvictor() {
        return new LFUEvictor();
    }
}
