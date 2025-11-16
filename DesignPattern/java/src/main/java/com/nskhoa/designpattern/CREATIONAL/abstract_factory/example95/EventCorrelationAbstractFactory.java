package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95;

public interface EventCorrelationAbstractFactory {
    Correlator createCorrelator();

    Notifier createNotifier();
}
