package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.log;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Collector;

public class LogCollector implements Collector {
    public void collect(String data) {
        System.out.println("Log Collected: " + data);
    }
}
