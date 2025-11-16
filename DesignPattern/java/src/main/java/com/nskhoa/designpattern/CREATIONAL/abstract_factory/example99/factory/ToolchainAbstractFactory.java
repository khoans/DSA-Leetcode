package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example99.factory;

public interface ToolchainAbstractFactory {
    Builder createBuilder();

    Deployer createDeployer();
}

