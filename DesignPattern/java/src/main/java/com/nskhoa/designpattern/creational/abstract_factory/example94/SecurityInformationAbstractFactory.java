package com.nskhoa.designpattern.creational.abstract_factory.example94;

public interface SecurityInformationAbstractFactory {
    Collector createCollector();

    Analyzer createAnalyzer();
}

// Usage: SecurityInformationAbstractFactory factory = new LogFactory(); Collector collector = factory.createCollector(); collector.collect("login event");
