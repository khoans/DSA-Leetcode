package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class GraphiteReporter implements Reporter {
    public void report(String data) {
        System.out.println("Graphite Reported: " + data);
    }
}
