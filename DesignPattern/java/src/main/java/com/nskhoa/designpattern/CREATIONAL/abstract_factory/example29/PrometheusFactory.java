package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class PrometheusFactory implements MetricsAbstractFactory {
    public Collector createCollector() { return new PrometheusCollector(); }
    public Reporter createReporter() { return new PrometheusReporter(); }
}
