package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example74;

public class RuntimeFactory implements FeatureToggleAbstractFactory {
    public Toggle createToggle() {
        return new RuntimeToggle();
    }

    public Evaluator createEvaluator() {
        return new RuntimeEvaluator();
    }
}
