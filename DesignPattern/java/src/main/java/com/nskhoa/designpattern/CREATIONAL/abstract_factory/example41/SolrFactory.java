package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public class SolrFactory implements SearchAbstractFactory {
    public Indexer createIndexer() {
        return new SolrIndexer();
    }

    public QueryHandler createQueryHandler() {
        return new SolrQueryHandler();
    }
}
