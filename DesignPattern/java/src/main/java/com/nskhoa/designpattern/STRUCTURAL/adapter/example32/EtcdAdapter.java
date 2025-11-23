package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class EtcdAdapter implements ConfigManager {
    private Etcd etcd = new Etcd();

    public String getValue(String key) {
        return etcd.etcdGet(key);
    }
}
