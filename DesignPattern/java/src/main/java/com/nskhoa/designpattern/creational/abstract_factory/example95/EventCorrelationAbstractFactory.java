package com.nskhoa.designpattern.creational.abstract_factory.example95;

public interface EventCorrelationAbstractFactory {
    Correlator createCorrelator();

    Notifier createNotifier();
}
