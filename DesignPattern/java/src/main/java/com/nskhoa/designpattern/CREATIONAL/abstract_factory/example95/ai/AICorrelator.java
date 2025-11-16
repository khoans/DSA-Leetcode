package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.ai;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.Correlator;

public class AICorrelator implements Correlator {
    public boolean correlate(String event1, String event2) {
        return true;
    }
}
