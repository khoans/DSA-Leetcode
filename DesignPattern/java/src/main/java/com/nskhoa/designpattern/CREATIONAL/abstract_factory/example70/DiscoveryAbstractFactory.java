package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public interface DiscoveryAbstractFactory {
    Registry createRegistry();

    Watcher createWatcher();
}

