package com.nskhoa.designpattern.creational.abstract_factory.example95.ai;

import com.nskhoa.designpattern.creational.abstract_factory.example95.Correlator;
import com.nskhoa.designpattern.creational.abstract_factory.example95.EventCorrelationAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example95.Notifier;

public class AIFactory implements EventCorrelationAbstractFactory {
    public Correlator createCorrelator() {
        return new AICorrelator();
    }

    public Notifier createNotifier() {
        return new AINotifier();
    }
}
