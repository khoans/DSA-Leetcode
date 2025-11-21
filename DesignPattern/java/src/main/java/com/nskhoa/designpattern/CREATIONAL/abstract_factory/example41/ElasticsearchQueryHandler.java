package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public class ElasticsearchQueryHandler implements QueryHandler {
    public String search(String query) {
        return "Elasticsearch Results";
    }
}
