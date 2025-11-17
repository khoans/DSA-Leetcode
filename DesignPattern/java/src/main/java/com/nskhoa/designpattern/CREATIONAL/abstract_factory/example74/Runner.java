package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example74;

public class Runner {
    public static void main(String[] args) {
        FeatureToggleAbstractFactory factory = new RuntimeFactory();
        Toggle toggle = factory.createToggle();
        Evaluator evaluator = factory.createEvaluator();

        System.out.println("Feature enabled: " + toggle.isEnabled("NewFeature"));
        System.out.println("User evaluated: " + evaluator.evaluate("User123"));
    }
}
