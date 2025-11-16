package com.nskhoa.designpattern.creational.abstract_factory.example99.factory.github;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Deployer;

public class GitHubDeployer implements Deployer {
    public void deploy(String artifact) {
        System.out.println("GitHub Deployed: " + artifact);
    }
}
