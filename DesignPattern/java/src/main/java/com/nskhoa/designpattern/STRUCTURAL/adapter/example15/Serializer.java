package com.nskhoa.designpattern.STRUCTURAL.adapter.example15;

public interface Serializer {
    String serialize(Object data);
    Object deserialize(String data);
}
