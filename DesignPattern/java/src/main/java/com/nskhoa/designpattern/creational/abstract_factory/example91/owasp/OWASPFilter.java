package com.nskhoa.designpattern.creational.abstract_factory.example91.owasp;

import com.nskhoa.designpattern.creational.abstract_factory.example91.Filter;

public class OWASPFilter implements Filter {
    public boolean block(String request) {
        return false;
    }
}
