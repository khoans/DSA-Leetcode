package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public class MLFactory implements FraudDetectionAbstractFactory {
    public Detector createDetector() {
        return new MLDetector();
    }

    public Alertor createAlertor() {
        return new MLAlertor();
    }
}
