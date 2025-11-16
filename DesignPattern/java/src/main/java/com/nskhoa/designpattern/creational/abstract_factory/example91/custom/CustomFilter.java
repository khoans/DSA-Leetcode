package com.nskhoa.designpattern.creational.abstract_factory.example91.custom;

import com.nskhoa.designpattern.creational.abstract_factory.example91.Filter;

public class CustomFilter implements Filter {
    public boolean block(String request) {
        return false;
    }
}
