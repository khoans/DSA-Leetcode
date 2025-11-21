package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public class ElasticsearchFactory implements SearchAbstractFactory {
    public Indexer createIndexer() {
        return new ElasticsearchIndexer();
    }

    public QueryHandler createQueryHandler() {
        return new ElasticsearchQueryHandler();
    }
}
