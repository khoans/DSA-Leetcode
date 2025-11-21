package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example40;

// Usage: CachingAbstractFactory factory = new InMemoryFactory(); Cache cache = factory.createCache(); cache.put("key", "value");
public class Runner {
    public static void main(String[] args) {
        CachingAbstractFactory factory = new InMemoryFactory();
        Cache cache = factory.createCache();
        Evictor evictor = factory.createEvictor();

        cache.put("user1", "John Doe");
        evictor.evict("user1");
    }
}
