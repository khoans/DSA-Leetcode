package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example93;

public interface BotDetectionAbstractFactory {
    Detector createDetector();

    Challenger createChallenger();
}



// Usage: BotDetectionAbstractFactory factory = new CAPTCHAF actory(); Detector detector = factory.createDetector(); boolean bot = detector.isBot("bot-agent");
