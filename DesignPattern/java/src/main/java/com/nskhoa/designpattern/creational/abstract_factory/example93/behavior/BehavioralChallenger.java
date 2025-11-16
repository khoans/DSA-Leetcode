package com.nskhoa.designpattern.creational.abstract_factory.example93.behavior;

import com.nskhoa.designpattern.creational.abstract_factory.example93.Challenger;

public class BehavioralChallenger implements Challenger {
    public void challenge(String session) {
        System.out.println("Behavioral Challenged: " + session);
    }
}
