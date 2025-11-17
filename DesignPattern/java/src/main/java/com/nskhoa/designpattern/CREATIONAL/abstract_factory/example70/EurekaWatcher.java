package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class EurekaWatcher implements Watcher {
    public String discover(String service) {
        return "Eureka Found: " + service;
    }
}
