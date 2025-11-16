package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.custom;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.Filter;

public class CustomFilter implements Filter {
    public boolean block(String request) {
        return false;
    }
}
