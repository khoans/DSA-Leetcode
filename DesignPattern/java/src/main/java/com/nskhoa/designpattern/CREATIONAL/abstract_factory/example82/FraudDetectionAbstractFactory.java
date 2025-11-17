package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public interface FraudDetectionAbstractFactory {
    Detector createDetector();

    Alertor createAlertor();
}

