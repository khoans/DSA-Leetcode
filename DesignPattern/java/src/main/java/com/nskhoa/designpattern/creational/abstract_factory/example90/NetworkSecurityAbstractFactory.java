package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90;

public interface NetworkSecurityAbstractFactory {
    Monitor createMonitor();

    Blocker createBlocker();
}

