package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class AlgoliaAdapter implements SearchEngine {
    private AlgoliaEngine algolia = new AlgoliaEngine();

    public void search(String query) {
        algolia.searchAlgolia(query);
    }
}
