package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.rule;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.Correlator;

public class RuleCorrelator implements Correlator {
    public boolean correlate(String event1, String event2) {
        return true;
    }
}
