package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example32;

public class GraphQLClient implements Client {
    public String request(String endpoint) {
        return "GraphQL Response";
    }
}
