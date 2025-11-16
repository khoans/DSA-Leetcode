package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.syn;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.DDoSProtectionAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.Detector;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.Mitigator;

public class SYNFactory implements DDoSProtectionAbstractFactory {
    public Detector createDetector() {
        return new SYNDetector();
    }

    public Mitigator createMitigator() {
        return new SYNMitigator();
    }
}

