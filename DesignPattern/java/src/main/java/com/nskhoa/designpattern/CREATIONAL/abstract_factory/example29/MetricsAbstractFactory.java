package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public interface MetricsAbstractFactory {
    Collector createCollector();

    Reporter createReporter();
}

// Usage: MetricsAbstractFactory factory = new PrometheusFactory(); Collector collector = factory.createCollector(); collector.collect("cpu.usage");

