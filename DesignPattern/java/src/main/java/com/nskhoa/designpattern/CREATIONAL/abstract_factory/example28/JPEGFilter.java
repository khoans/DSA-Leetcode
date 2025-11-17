package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class JPEGFilter implements Filter {
    public void apply(String image) {
        System.out.println("JPEG Filtered: " + image);
    }
}
