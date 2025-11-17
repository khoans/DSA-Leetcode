package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class CloudFactory implements DNSAbstractFactory {
    public Resolver createResolver() {
        return new CloudResolver();
    }

    public Cache createCache() {
        return new CloudCache();
    }
}
