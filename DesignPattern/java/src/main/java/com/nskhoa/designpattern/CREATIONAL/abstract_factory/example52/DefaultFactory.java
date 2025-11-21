package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

public class DefaultFactory implements XPathAbstractFactory {
    public Evaluator createEvaluator() {
        return new DefaultEvaluator();
    }

    public Resolver createResolver() {
        return new DefaultResolver();
    }
}
