package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.captcha;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.BotDetectionAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.Challenger;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.Detector;

public class CAPTCHAFactory implements BotDetectionAbstractFactory {
    public Detector createDetector() {
        return new CAPTCHADetector();
    }

    public Challenger createChallenger() {
        return new CAPTCHAChallenger();
    }
}
