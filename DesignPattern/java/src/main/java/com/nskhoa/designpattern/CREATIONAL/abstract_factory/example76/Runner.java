package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class Runner {
    public static void main(String[] args) {
        CDNAbstractFactory factory = new CloudFrontFactory();
        Distributor distributor = factory.createDistributor();
        Cacher cacher = factory.createCacher();

        cacher.cache("http://example.com/content");
        System.out.println(distributor.deliver("http://example.com/content"));

        factory = new AkamaiFactory();
        distributor = factory.createDistributor();
        cacher = factory.createCacher();

        cacher.cache("http://example.com/content");
        System.out.println(distributor.deliver("http://example.com/content"));
    }
}
