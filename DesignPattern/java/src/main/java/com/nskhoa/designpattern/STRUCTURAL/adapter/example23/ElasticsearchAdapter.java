package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class ElasticsearchAdapter implements SearchEngine {
    private ElasticsearchEngine elasticsearch = new ElasticsearchEngine();

    public void search(String query) {
        elasticsearch.searchElasticsearch(query);
    }
}
