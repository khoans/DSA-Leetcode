package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class AkamaiCacher implements Cacher {
    public void cache(String url) {
        System.out.println("Akamai Cached: " + url);
    }
}
