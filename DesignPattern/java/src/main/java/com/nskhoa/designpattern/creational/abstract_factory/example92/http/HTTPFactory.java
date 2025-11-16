package com.nskhoa.designpattern.creational.abstract_factory.example92.http;

import com.nskhoa.designpattern.creational.abstract_factory.example92.DDoSProtectionAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example92.Detector;
import com.nskhoa.designpattern.creational.abstract_factory.example92.Mitigator;

public class HTTPFactory implements DDoSProtectionAbstractFactory {
    public Detector createDetector() {
        return new HTTPDetector();
    }

    public Mitigator createMitigator() {
        return new HTTPMitigator();
    }
}

