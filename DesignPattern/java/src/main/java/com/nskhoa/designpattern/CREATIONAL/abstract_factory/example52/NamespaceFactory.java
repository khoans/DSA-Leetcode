package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

public class NamespaceFactory implements XPathAbstractFactory {
    public Evaluator createEvaluator() {
        return new NamespaceEvaluator();
    }

    public Resolver createResolver() {
        return new NamespaceResolver();
    }
}
