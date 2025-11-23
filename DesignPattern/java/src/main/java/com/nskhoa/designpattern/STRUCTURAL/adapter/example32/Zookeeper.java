package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class Zookeeper {
    String zkGet(String key) {
        return "value_from_zookeeper_for_" + key;
    }
}
