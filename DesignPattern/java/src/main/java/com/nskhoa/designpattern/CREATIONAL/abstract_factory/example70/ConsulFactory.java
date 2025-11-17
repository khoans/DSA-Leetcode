package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class ConsulFactory implements DiscoveryAbstractFactory {
    public Registry createRegistry() {
        return new ConsulRegistry();
    }

    public Watcher createWatcher() {
        return new ConsulWatcher();
    }
}
