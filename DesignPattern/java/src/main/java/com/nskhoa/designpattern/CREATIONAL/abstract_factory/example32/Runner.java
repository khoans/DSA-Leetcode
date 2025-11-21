package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example32;

// Usage: APIAbstractFactory factory = new HTTPFactory(); Client client = factory.createClient(); String resp = client.request("/api");
public class Runner {
    public static void main(String[] args) {
        APIAbstractFactory factory = new HTTPFactory();
        Client client = factory.createClient();
        Parser parser = factory.createParser();

        String response = client.request("/api/data");
        Object data = parser.parse(response);

        System.out.println("Response: " + response);
        System.out.println("Parsed Data: " + data);
    }
}
