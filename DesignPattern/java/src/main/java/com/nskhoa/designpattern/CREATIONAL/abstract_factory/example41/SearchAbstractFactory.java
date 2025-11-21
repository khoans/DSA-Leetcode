package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public interface SearchAbstractFactory {
    Indexer createIndexer();

    QueryHandler createQueryHandler();
}
