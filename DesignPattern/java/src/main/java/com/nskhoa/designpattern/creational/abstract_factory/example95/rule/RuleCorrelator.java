package com.nskhoa.designpattern.creational.abstract_factory.example95.rule;

import com.nskhoa.designpattern.creational.abstract_factory.example95.Correlator;

public class RuleCorrelator implements Correlator {
    public boolean correlate(String event1, String event2) {
        return true;
    }
}
