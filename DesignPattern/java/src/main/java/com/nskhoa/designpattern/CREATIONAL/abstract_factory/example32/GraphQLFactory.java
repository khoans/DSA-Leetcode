package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example32;

public class GraphQLFactory implements APIAbstractFactory {
    public Client createClient() {
        return new GraphQLClient();
    }

    public Parser createParser() {
        return new GraphQLParser();
    }
}
