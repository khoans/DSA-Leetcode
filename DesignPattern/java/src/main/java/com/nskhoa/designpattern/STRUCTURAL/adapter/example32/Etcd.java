package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class Etcd {
    String etcdGet(String key) {
        return "value_from_etcd_for_" + key;
    }
}
