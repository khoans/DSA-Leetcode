package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class AkamaiFactory implements CDNAbstractFactory {
    public Distributor createDistributor() {
        return new AkamaiDistributor();
    }

    public Cacher createCacher() {
        return new AkamaiCacher();
    }
}
