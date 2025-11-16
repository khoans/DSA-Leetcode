package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.captcha;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93.Detector;

public class CAPTCHADetector implements Detector {
    public boolean isBot(String userAgent) {
        return false;
    }
}
