package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class ProxyRouter implements Router {
    public String route(String path) {
        return "Proxied to " + path;
    }
}
