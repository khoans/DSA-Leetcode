package com.nskhoa.designpattern.creational.abstract_factory.example94.log;

import com.nskhoa.designpattern.creational.abstract_factory.example94.Analyzer;
import com.nskhoa.designpattern.creational.abstract_factory.example94.Collector;
import com.nskhoa.designpattern.creational.abstract_factory.example94.SecurityInformationAbstractFactory;

public class LogFactory implements SecurityInformationAbstractFactory {
    public Collector createCollector() { return new LogCollector(); }
    public Analyzer createAnalyzer() { return new LogAnalyzer(); }
}
