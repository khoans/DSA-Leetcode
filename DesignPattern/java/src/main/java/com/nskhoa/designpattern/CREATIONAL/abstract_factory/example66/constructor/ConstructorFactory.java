package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.constructor;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.DIAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.Injector;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.Resolver;

public class ConstructorFactory implements DIAbstractFactory {
    public Injector createInjector() {
        return new ConstructorInjector();
    }

    public Resolver createResolver() {
        return new ConstructorResolver();
    }
}
