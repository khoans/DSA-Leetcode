package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class ConsulWatcher implements Watcher {
    public String discover(String service) {
        return "Consul Found: " + service;
    }
}
