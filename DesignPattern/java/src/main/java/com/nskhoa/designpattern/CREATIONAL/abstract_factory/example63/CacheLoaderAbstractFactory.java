package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public interface CacheLoaderAbstractFactory {
    Loader createLoader();

    Expirer createExpirer();
}

