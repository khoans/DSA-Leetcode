package com.nskhoa.designpattern.creational.abstract_factory.example94.log;

import com.nskhoa.designpattern.creational.abstract_factory.example94.Analyzer;

public class LogAnalyzer implements Analyzer {
    public String analyze(String input) {
        return "Log Analysis: " + input;
    }
}
