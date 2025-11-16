package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.aws.AWSFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.gcp.GCPFactory;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== VPC Abstract Factory Pattern Demo ===\n");

        // Create AWS VPC infrastructure
        System.out.println("--- Setting up AWS Infrastructure ---");
        VPCAbstractFactory awsFactory = new AWSFactory();
        setupVPC(awsFactory, "10.0.0.0/16", "us-east-1a");

        System.out.println();

        // Create GCP VPC infrastructure
        System.out.println("--- Setting up GCP Infrastructure ---");
        VPCAbstractFactory gcpFactory = new GCPFactory();
        setupVPC(gcpFactory, "192.168.0.0/16", "us-central1-a");

        System.out.println("\n=== Demo Complete ===");
    }

    private static void setupVPC(VPCAbstractFactory factory, String cidr, String zone) {
        // Create configurator and configure VPC
        Configurator configurator = factory.createConfigurator();
        configurator.configure(cidr);

        // Create network and set up subnet
        Network network = factory.createNetwork();
        String subnetInfo = network.subnet(zone);
        System.out.println("Created: " + subnetInfo);
    }
}

