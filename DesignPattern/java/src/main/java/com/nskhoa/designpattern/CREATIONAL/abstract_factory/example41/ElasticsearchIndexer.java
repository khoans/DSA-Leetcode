package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public class ElasticsearchIndexer implements Indexer {
    public void index(String document) {
        System.out.println("Elasticsearch Indexed: " + document);
    }
}
