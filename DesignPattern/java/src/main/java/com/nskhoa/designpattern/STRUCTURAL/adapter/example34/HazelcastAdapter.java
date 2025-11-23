package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class HazelcastAdapter implements CacheService {
    private HazelcastCache hazelcast = new HazelcastCache();
    public void put(String key, String value) { hazelcast.hazelcastPut(key,value); }
    public String get(String key) { return hazelcast.hazelcastGet(key); }
}
