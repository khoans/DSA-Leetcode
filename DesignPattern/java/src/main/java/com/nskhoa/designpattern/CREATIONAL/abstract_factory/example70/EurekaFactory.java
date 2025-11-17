package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class EurekaFactory implements DiscoveryAbstractFactory {
    public Registry createRegistry() {
        return new EurekaRegistry();
    }

    public Watcher createWatcher() {
        return new EurekaWatcher();
    }
}
