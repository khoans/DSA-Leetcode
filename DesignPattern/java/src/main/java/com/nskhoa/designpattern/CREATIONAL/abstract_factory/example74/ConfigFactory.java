package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example74;

public class ConfigFactory implements FeatureToggleAbstractFactory {
    public Toggle createToggle() {
        return new ConfigToggle();
    }

    public Evaluator createEvaluator() {
        return new ConfigEvaluator();
    }
}
