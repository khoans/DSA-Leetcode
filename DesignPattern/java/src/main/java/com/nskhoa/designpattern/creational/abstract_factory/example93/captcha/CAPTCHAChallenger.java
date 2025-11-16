package com.nskhoa.designpattern.creational.abstract_factory.example93.captcha;

import com.nskhoa.designpattern.creational.abstract_factory.example93.Challenger;

public class CAPTCHAChallenger implements Challenger {
    public void challenge(String session) {
        System.out.println("CAPTCHA Challenged: " + session);
    }
}
