package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example30;

// Client runner
public class DataTransformationDemo {
    public static void main(String[] args) {
        DataTransformer normalizer = new NormalizationTransformer();
        DataTransformer enricher = new EnrichmentTransformer();
        DataTransformer formatter = new FormattingTransformer();

        normalizer.setNextTransformer(enricher);
        enricher.setNextTransformer(formatter);

        Data data = new Data("Raw DATA Content");
        normalizer.transform(data);
    }
}
