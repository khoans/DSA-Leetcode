package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example99.factory.github;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example99.factory.Builder;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example99.factory.Deployer;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example99.factory.ToolchainAbstractFactory;

public class GitHubFactory implements ToolchainAbstractFactory {
    public Builder createBuilder() {
        return new GitHubBuilder();
    }

    public Deployer createDeployer() {
        return new GitHubDeployer();
    }
}
