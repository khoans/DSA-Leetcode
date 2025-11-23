package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class HazelcastCache {
    void hazelcastPut(String key, String val) {
        System.out.println("Hazelcast cached " + key);
    }
    String hazelcastGet(String key) {
        return "Hazelcast:" + key;
    }
}
