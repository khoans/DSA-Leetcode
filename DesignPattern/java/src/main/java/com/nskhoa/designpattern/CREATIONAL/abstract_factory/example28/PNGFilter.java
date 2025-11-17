package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class PNGFilter implements Filter {
    public void apply(String image) {
        System.out.println("PNG Filtered: " + image);
    }
}
