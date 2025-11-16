package com.nskhoa.designpattern.creational.abstract_factory.example98.factory.lambda;

import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.Invoker;

public class LambdaInvoker implements Invoker {
    public void invoke(String function) {
        System.out.println("Lambda Invoked: " + function);
    }
}

