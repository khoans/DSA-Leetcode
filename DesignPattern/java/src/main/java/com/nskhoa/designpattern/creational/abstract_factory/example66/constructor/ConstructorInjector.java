package com.nskhoa.designpattern.creational.abstract_factory.example66.constructor;

import com.nskhoa.designpattern.creational.abstract_factory.example66.Injector;

public class ConstructorInjector implements Injector {
    public void inject(Object bean) {
        System.out.println("Constructor Injected: " + bean);
    }
}
