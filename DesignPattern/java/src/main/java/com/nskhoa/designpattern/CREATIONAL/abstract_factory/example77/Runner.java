package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class Runner {
    public static void main(String[] args) {
        DNSAbstractFactory factory = new LocalFactory();
        Resolver resolver = factory.createResolver();
        Cache cache = factory.createCache();

        String domain = "example.com";
        String ip = resolver.resolve(domain);
        cache.store(domain, ip);

        factory = new CloudFactory();
        resolver = factory.createResolver();
        cache = factory.createCache();

        ip = resolver.resolve(domain);
        cache.store(domain, ip);
    }
}
