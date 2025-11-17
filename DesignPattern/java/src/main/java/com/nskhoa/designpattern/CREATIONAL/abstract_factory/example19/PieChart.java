package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example19;

public class PieChart implements Chart {
    public void draw(String data) {
        System.out.println("Pie Chart Drawn: " + data);
    }
}
