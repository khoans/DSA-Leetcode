package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.event;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Collector;

public class EventCollector implements Collector {
    public void collect(String data) {
        System.out.println("Event Collected: " + data);
    }
}
