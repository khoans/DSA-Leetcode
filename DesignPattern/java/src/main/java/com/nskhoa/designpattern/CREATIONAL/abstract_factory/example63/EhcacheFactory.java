package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example63;

public class EhcacheFactory implements CacheLoaderAbstractFactory {
    public Loader createLoader() {
        return new EhcacheLoader();
    }

    public Expirer createExpirer() {
        return new EhcacheExpirer();
    }
}
