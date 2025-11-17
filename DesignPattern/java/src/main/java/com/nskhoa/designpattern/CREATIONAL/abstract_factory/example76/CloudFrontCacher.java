package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class CloudFrontCacher implements Cacher {
    public void cache(String url) {
        System.out.println("CloudFront Cached: " + url);
    }
}
