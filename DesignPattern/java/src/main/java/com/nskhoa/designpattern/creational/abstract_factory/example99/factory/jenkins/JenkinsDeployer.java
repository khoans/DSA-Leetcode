package com.nskhoa.designpattern.creational.abstract_factory.example99.factory.jenkins;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Deployer;

public class JenkinsDeployer implements Deployer {
    public void deploy(String artifact) {
        System.out.println("Jenkins Deployed: " + artifact);
    }
}

