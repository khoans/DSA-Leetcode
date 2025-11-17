package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public class Runner {
    public static void main(String[] args) {
        PluginAbstractFactory factory = new JavaFactory();
        Loader loader = factory.createLoader();
        Executor executor = factory.createExecutor();

        loader.load("plugin.jar");
        executor.execute("System.out.println('Hello, World!');");
    }
}
