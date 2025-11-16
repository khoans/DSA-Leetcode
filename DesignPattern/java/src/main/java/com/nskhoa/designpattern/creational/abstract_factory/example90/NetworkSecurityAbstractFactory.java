package com.nskhoa.designpattern.creational.abstract_factory.example90;

public interface NetworkSecurityAbstractFactory {
    Monitor createMonitor();

    Blocker createBlocker();
}

