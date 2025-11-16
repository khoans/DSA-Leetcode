package com.nskhoa.designpattern.creational.abstract_factory.example92.syn;

import com.nskhoa.designpattern.creational.abstract_factory.example92.Mitigator;

public class SYNMitigator implements Mitigator {
    public void mitigate(String attack) {
        System.out.println("SYN Mitigated: " + attack);
    }
}

