package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class PrometheusCollector implements Collector {
    public void collect(String metric) {
        System.out.println("Prometheus Collected: " + metric);
    }
}
