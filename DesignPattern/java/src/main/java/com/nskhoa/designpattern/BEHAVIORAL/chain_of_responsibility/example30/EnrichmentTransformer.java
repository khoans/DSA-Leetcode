package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example30;

public class EnrichmentTransformer extends DataTransformer {
    @Override
    public void transform(Data data) {
        data.setContent(data.getContent() + " [enriched]");
        System.out.println("Enriched data: " + data.getContent());
        if (nextTransformer != null) {
            nextTransformer.transform(data);
        }
    }
}
