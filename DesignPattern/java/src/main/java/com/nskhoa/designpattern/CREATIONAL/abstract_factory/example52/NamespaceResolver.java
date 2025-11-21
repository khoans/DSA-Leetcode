package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

public class NamespaceResolver implements Resolver {
    public String resolve(String prefix) {
        return "Namespace Resolved";
    }
}
