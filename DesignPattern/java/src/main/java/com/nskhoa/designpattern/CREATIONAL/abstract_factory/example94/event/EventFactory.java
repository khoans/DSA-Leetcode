package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.event;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Analyzer;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.Collector;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example94.SecurityInformationAbstractFactory;

public class EventFactory implements SecurityInformationAbstractFactory {
    public Collector createCollector() {
        return new EventCollector();
    }

    public Analyzer createAnalyzer() {
        return new EventAnalyzer();
    }
}
