package com.nskhoa.designpattern.creational.abstract_factory.example96.gcp;

import com.nskhoa.designpattern.creational.abstract_factory.example96.Configurator;

public class GCPConfigurator implements Configurator {
    public void configure(String cidr) {
        System.out.println("GCP VPC Configured: " + cidr);
    }
}

