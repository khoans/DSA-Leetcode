package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.log;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Analyzer;

public class LogAnalyzer implements Analyzer {
    public String analyze(String input) {
        return "Log Analysis: " + input;
    }
}
