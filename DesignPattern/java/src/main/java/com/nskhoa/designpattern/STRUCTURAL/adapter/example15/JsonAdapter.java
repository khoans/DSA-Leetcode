package com.nskhoa.designpattern.STRUCTURAL.adapter.example15;

public class JsonAdapter implements Serializer {
    private JsonSerializer jsonSerializer = new JsonSerializer();

    public String serialize(Object data) {
        return jsonSerializer.toJson(data);
    }

    public Object deserialize(String data) {
        return jsonSerializer.fromJson(data);
    }
}
