package com.nskhoa.designpattern.creational.abstract_factory.example94;

import com.nskhoa.designpattern.creational.abstract_factory.example94.log.LogFactory;

public class Runner {
    public static void main(String[] args) {
        SecurityInformationAbstractFactory factory = new LogFactory();
        Collector collector = factory.createCollector();
        Analyzer analyzer = factory.createAnalyzer();
        collector.collect("login event");
        analyzer.analyze("login event");
    }
}
