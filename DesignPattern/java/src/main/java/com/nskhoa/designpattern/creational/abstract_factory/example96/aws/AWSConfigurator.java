package com.nskhoa.designpattern.creational.abstract_factory.example96.aws;

import com.nskhoa.designpattern.creational.abstract_factory.example96.Configurator;

public class AWSConfigurator implements Configurator {
    public void configure(String cidr) {
        System.out.println("AWS VPC Configured: " + cidr);
    }
}

