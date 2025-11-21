package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

public interface XPathAbstractFactory {
    Evaluator createEvaluator();

    Resolver createResolver();
}
