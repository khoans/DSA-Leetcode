package com.nskhoa.designpattern.creational.abstract_factory.example99.factory;

public interface ToolchainAbstractFactory {
    Builder createBuilder();

    Deployer createDeployer();
}

