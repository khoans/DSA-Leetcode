package com.nskhoa.designpattern.STRUCTURAL.adapter.example15;

public class Client {
    public static void main(String[] args) {
        Serializer jsonAdapter = new JsonAdapter();
        String jsonData = jsonAdapter.serialize(new Object());
        Object objFromJson = jsonAdapter.deserialize(jsonData);

        Serializer xmlAdapter = new XmlAdapter();
        String xmlData = xmlAdapter.serialize(new Object());
        Object objFromXml = xmlAdapter.deserialize(xmlData);
    }
}
