package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example52;

// Usage: XPathAbstractFactory factory = new DefaultFactory(); Evaluator eval = factory.createEvaluator(); String result = eval.evaluate("//node");

public class Runner {
    public static void main(String[] args) {
        XPathAbstractFactory factory = new DefaultFactory();
        Evaluator evaluator = factory.createEvaluator();
        Resolver resolver = factory.createResolver();

        System.out.println(evaluator.evaluate("//book"));
        System.out.println(resolver.resolve("ns"));
    }
}
