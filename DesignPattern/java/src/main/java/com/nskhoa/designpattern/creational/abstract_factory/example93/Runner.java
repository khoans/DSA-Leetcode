package com.nskhoa.designpattern.creational.abstract_factory.example93;

import com.nskhoa.designpattern.creational.abstract_factory.example93.behavior.BehavioralFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example93.captcha.CAPTCHAFactory;

public class Runner {
    public static void main(String[] args) {
        BotDetectionAbstractFactory factory = new CAPTCHAFactory();
        Detector detector = factory.createDetector();
        Challenger challenger = factory.createChallenger();
        boolean bot = detector.isBot("bot-agent");
        challenger.challenge("session-1234");

        System.out.println("Is bot: " + bot);

        BotDetectionAbstractFactory behavioralFactory = new BehavioralFactory();
        Detector behavioralDetector = behavioralFactory.createDetector();
        Challenger behavioralChallenger = behavioralFactory.createChallenger();
        boolean isBehavioralBot = behavioralDetector.isBot("normal-agent");
        behavioralChallenger.challenge("session-5678");
        System.out.println("Is bot: " + isBehavioralBot);
    }
}
