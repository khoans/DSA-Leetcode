package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class SolrAdapter implements SearchEngine {
    private SolrEngine solr = new SolrEngine();

    public void search(String query) {
        solr.searchSolr(query);
    }
}
