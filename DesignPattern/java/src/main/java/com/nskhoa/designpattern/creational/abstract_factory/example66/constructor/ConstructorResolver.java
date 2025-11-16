package com.nskhoa.designpattern.creational.abstract_factory.example66.constructor;

import com.nskhoa.designpattern.creational.abstract_factory.example66.Resolver;

public class ConstructorResolver implements Resolver {
    public Object resolve(String dependency) {
        return new Object();
    }
}
