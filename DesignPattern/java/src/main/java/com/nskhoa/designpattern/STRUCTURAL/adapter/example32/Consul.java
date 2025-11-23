package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class Consul {
    String consulGet(String key) {
        return "value_from_consul_for_" + key;
    }
}
