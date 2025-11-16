package com.nskhoa.designpattern.creational.abstract_factory.example98.factory.cloudfunctions;

import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.Handler;
import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.Invoker;
import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.ServerlessAbstractFactory;

public class CloudFunctionsFactory implements ServerlessAbstractFactory {
    public Invoker createInvoker() {
        return new CloudFunctionsInvoker();
    }

    public Handler createHandler() {
        return new CloudFunctionsHandler();
    }
}
