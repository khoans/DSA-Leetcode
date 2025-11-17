package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public interface ChartAbstractFactory {
    Chart createChart();

    Renderer createRenderer();
}

// Usage: ChartAbstractFactory factory = new BarFactory(); Chart chart = factory.createChart(); chart.draw("sales");

