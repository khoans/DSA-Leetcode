package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class LocalResolver implements Resolver {
    public String resolve(String domain) {
        return "Local IP for " + domain;
    }
}
