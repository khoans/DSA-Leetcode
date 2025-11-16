package com.nskhoa.designpattern.creational.abstract_factory.example66;

public interface DIAbstractFactory {
    Injector createInjector();

    Resolver createResolver();
}

