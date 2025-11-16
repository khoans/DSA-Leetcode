package com.nskhoa.designpattern.creational.abstract_factory.example66.setter;

import com.nskhoa.designpattern.creational.abstract_factory.example66.DIAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example66.Injector;
import com.nskhoa.designpattern.creational.abstract_factory.example66.Resolver;

public class SetterFactory implements DIAbstractFactory {
    public Injector createInjector() {
        return new SetterInjector();
    }

    public Resolver createResolver() {
        return new SetterResolver();
    }
}
