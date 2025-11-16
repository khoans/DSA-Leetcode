package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.constructor.ConstructorFactory;

public class Runner {
    public static void main(String[] args) {
        // Usage:
        DIAbstractFactory factory = new ConstructorFactory();
        Injector injector = factory.createInjector();
        Resolver resolver = factory.createResolver();
        injector.inject(new Object());
        resolver.resolve("dependency");
    }
}
