package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public class Runner {
    public static void main(String[] args) {
        ChartAbstractFactory factory = new BarFactory();
        Chart chart = factory.createChart();
        Renderer renderer = factory.createRenderer();

        chart.draw("Sales Data");
        renderer.render();
    }
}
