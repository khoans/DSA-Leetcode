package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.lambda;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.Handler;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.Invoker;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.ServerlessAbstractFactory;

public class LambdaFactory implements ServerlessAbstractFactory {
    public Invoker createInvoker() {
        return new LambdaInvoker();
    }

    public Handler createHandler() {
        return new LambdaHandler();
    }
}
