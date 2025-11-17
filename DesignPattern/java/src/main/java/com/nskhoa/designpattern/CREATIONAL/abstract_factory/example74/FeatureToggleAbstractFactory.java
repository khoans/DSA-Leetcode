package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example74;

public interface FeatureToggleAbstractFactory {
    Toggle createToggle();

    Evaluator createEvaluator();
}

