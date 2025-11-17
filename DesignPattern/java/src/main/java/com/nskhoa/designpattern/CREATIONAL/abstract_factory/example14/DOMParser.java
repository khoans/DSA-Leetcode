package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

public class DOMParser implements Parser {
    public void parse(String xml) {
        System.out.println("DOM Parsed: " + xml);
    }
}
