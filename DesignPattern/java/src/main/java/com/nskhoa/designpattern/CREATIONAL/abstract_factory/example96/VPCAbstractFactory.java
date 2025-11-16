package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96;

public interface VPCAbstractFactory {
    Configurator createConfigurator();

    Network createNetwork();
}

