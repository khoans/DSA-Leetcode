package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public class PieFactory implements ChartAbstractFactory {
    public Chart createChart() {
        return new PieChart();
    }

    public Renderer createRenderer() {
        return new PieRenderer();
    }
}
