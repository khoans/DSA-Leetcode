package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class Runner {
    public static void main(String[] args) {
        MetricsAbstractFactory factory = new PrometheusFactory();
        Collector collector = factory.createCollector();
        Reporter reporter = factory.createReporter();

        collector.collect("cpu.usage");
        reporter.report("cpu.usage: 75%");
    }
}
