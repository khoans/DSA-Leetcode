package com.nskhoa.designpattern.creational.abstract_factory.example99.factory.jenkins;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Builder;
import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Deployer;
import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.ToolchainAbstractFactory;

public class JenkinsFactory implements ToolchainAbstractFactory {
    public Builder createBuilder() {
        return new JenkinsBuilder();
    }

    public Deployer createDeployer() {
        return new JenkinsDeployer();
    }
}
