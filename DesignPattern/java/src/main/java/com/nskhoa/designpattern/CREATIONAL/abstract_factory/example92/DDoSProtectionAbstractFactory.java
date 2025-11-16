package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92;

public interface DDoSProtectionAbstractFactory {
    Detector createDetector();

    Mitigator createMitigator();
}
