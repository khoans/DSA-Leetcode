package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

public interface CachingAbstractFactory {
    Cache createCache();

    Evictor createEvictor();
}
