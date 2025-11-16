package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.rule;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.Correlator;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.EventCorrelationAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.Notifier;

public class RuleFactory implements EventCorrelationAbstractFactory {
    public Correlator createCorrelator() {
        return new RuleCorrelator();
    }

    public Notifier createNotifier() {
        return new RuleNotifier();
    }
}
