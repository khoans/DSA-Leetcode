package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example29;

public class GraphiteCollector implements Collector {
    public void collect(String metric) {
        System.out.println("Graphite Collected: " + metric);
    }
}
