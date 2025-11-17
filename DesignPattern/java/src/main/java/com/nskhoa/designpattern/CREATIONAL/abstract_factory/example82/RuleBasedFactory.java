package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public class RuleBasedFactory implements FraudDetectionAbstractFactory {
    public Detector createDetector() {
        return new RuleBasedDetector();
    }

    public Alertor createAlertor() {
        return new RuleBasedAlertor();
    }
}
