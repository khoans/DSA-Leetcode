package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

public class DefaultResolver implements Resolver {
    public String resolve(String prefix) {
        return "Default Resolved";
    }
}
