package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

// Usage: SearchAbstractFactory factory = new ElasticsearchFactory(); Indexer indexer = factory.createIndexer(); indexer.index("doc");
public class Runner {
    public static void main(String[] args) {
        SearchAbstractFactory factory = new ElasticsearchFactory();
        Indexer indexer = factory.createIndexer();
        QueryHandler queryHandler = factory.createQueryHandler();

        indexer.index("Document 1");
        System.out.println(queryHandler.search("query"));
    }
}
