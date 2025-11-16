package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.constructor;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example66.Injector;

public class ConstructorInjector implements Injector {
    public void inject(Object bean) {
        System.out.println("Constructor Injected: " + bean);
    }
}
