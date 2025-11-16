package com.nskhoa.designpattern.creational.abstract_factory.example96.aws;

import com.nskhoa.designpattern.creational.abstract_factory.example96.Configurator;
import com.nskhoa.designpattern.creational.abstract_factory.example96.Network;
import com.nskhoa.designpattern.creational.abstract_factory.example96.VPCAbstractFactory;

public class AWSFactory implements VPCAbstractFactory {
    public Configurator createConfigurator() {
        return new AWSConfigurator();
    }

    public Network createNetwork() {
        return new AWSNetwork();
    }
}

