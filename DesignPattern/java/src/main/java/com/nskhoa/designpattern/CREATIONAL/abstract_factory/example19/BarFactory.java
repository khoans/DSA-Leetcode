package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public class BarFactory implements ChartAbstractFactory {
    public Chart createChart() {
        return new BarChart();
    }

    public Renderer createRenderer() {
        return new BarRenderer();
    }
}
