package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class LocalFactory implements DNSAbstractFactory {
    public Resolver createResolver() {
        return new LocalResolver();
    }

    public Cache createCache() {
        return new LocalCache();
    }
}
