package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public interface PluginAbstractFactory {
    Loader createLoader();

    Executor createExecutor();
}

// Usage: PluginAbstractFactory factory = new JavaFactory(); Loader loader = factory.createLoader(); loader.load("plugin.jar");

