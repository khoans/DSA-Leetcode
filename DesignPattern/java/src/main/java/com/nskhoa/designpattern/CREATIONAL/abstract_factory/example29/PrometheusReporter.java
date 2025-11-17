package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class PrometheusReporter implements Reporter {
    public void report(String data) {
        System.out.println("Prometheus Reported: " + data);
    }
}
