package com.nskhoa.designpattern.creational.abstract_factory.example93.behavior;

import com.nskhoa.designpattern.creational.abstract_factory.example93.Detector;

public class BehavioralDetector implements Detector {
    public boolean isBot(String userAgent) {
        return false;
    }
}
