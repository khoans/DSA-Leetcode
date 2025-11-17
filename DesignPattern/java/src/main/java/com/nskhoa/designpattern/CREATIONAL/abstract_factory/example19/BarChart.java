package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public class BarChart implements Chart {
    public void draw(String data) {
        System.out.println("Bar Chart Drawn: " + data);
    }
}
