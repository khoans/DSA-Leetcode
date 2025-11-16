package com.nskhoa.designpattern.creational.abstract_factory.example93.behavior;

import com.nskhoa.designpattern.creational.abstract_factory.example93.BotDetectionAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example93.Challenger;
import com.nskhoa.designpattern.creational.abstract_factory.example93.Detector;

public class BehavioralFactory implements BotDetectionAbstractFactory {
    public Detector createDetector() {
        return new BehavioralDetector();
    }

    public Challenger createChallenger() {
        return new BehavioralChallenger();
    }
}
