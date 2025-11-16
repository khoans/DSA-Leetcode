package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.cloudfunctions;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.Invoker;

public class CloudFunctionsInvoker implements Invoker {
    public void invoke(String function) {
        System.out.println("Cloud Functions Invoked: " + function);
    }
}

