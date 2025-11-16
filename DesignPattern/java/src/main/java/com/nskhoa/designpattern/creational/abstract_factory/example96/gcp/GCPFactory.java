package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.gcp;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.Configurator;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.Network;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.VPCAbstractFactory;

public class GCPFactory implements VPCAbstractFactory {
    public Configurator createConfigurator() {
        return new GCPConfigurator();
    }

    public Network createNetwork() {
        return new GCPNetwork();
    }
}

