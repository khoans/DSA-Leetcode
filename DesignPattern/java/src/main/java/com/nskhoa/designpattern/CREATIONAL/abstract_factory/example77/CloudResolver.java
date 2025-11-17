package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example77;

public class CloudResolver implements Resolver {
    public String resolve(String domain) {
        return "Cloud IP for " + domain;
    }
}
