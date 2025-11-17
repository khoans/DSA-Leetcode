package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public interface DNSAbstractFactory {
    Resolver createResolver();

    Cache createCache();
}

