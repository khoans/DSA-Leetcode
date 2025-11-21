package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example41;

public class SolrIndexer implements Indexer {
    public void index(String document) {
        System.out.println("Solr Indexed: " + document);
    }
}
