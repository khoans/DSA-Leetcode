package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class ConsulAdapter implements ConfigManager {
    private Consul consul = new Consul();

    public String getValue(String key) {
        return consul.consulGet(key);
    }
}
