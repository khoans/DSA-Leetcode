package com.nskhoa.designpattern.creational.abstract_factory.example66.setter;

import com.nskhoa.designpattern.creational.abstract_factory.example66.Injector;

public class SetterInjector implements Injector {
    public void inject(Object bean) {
        System.out.println("Setter Injected: " + bean);
    }
}
