package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class CloudFrontFactory implements CDNAbstractFactory {
    public Distributor createDistributor() {
        return new CloudFrontDistributor();
    }

    public Cacher createCacher() {
        return new CloudFrontCacher();
    }
}
