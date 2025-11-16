package com.nskhoa.designpattern.creational.abstract_factory.example92.http;

import com.nskhoa.designpattern.creational.abstract_factory.example92.Mitigator;

public class HTTPMitigator implements Mitigator {
    public void mitigate(String attack) {
        System.out.println("HTTP Mitigated: " + attack);
    }
}

