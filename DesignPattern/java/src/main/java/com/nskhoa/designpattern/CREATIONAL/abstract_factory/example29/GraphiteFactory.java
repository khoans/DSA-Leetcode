package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class GraphiteFactory implements MetricsAbstractFactory {
    public Collector createCollector() { return new GraphiteCollector(); }
    public Reporter createReporter() { return new GraphiteReporter(); }
}
