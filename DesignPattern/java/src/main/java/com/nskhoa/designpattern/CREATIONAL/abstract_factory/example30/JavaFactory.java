package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public class JavaFactory implements PluginAbstractFactory {
    public Loader createLoader() {
        return new JavaLoader();
    }

    public Executor createExecutor() {
        return new JavaExecutor();
    }
}
