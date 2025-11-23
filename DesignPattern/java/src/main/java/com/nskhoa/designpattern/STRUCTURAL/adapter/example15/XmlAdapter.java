package com.nskhoa.designpattern.STRUCTURAL.adapter.example15;

public class XmlAdapter implements Serializer {
    private XmlSerializer xmlSerializer = new XmlSerializer();

    public String serialize(Object data) {
        return xmlSerializer.toXml(data);
    }

    public Object deserialize(String data) {
        return xmlSerializer.fromXml(data);
    }
}
