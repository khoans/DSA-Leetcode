package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class ZookeeperAdapter implements ConfigManager {
    private Zookeeper zk = new Zookeeper();

    public String getValue(String key) {
        return zk.zkGet(key);
    }
}
