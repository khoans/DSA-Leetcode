package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.event;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Analyzer;

public class EventAnalyzer implements Analyzer {
    public String analyze(String input) {
        return "Event Analysis: " + input;
    }
}
