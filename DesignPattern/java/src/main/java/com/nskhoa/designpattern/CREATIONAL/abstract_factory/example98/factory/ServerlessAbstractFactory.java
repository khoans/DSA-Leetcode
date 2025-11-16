package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory;

public interface ServerlessAbstractFactory {
    Invoker createInvoker();
    Handler createHandler();
}

