package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public class PythonFactory implements PluginAbstractFactory {
    public Loader createLoader() {
        return new PythonLoader();
    }

    public Executor createExecutor() {
        return new PythonExecutor();
    }
}
