package com.nskhoa.designpattern.creational.abstract_factory.example98.factory;

public interface ServerlessAbstractFactory {
    Invoker createInvoker();
    Handler createHandler();
}

