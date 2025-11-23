package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class Client {
    private SearchEngine searchEngine;

    public Client(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public void performSearch(String query) {
        searchEngine.search(query);
    }

    public static void main(String[] args) {
        SearchEngine elasticsearch = new ElasticsearchAdapter();
        SearchEngine solr = new SolrAdapter();
        SearchEngine algolia = new AlgoliaAdapter();

        Client client1 = new Client(elasticsearch);
        Client client2 = new Client(solr);
        Client client3 = new Client(algolia);

        client1.performSearch("Design Patterns");
        client2.performSearch("Adapter Pattern");
        client3.performSearch("Structural Patterns");
    }
}
