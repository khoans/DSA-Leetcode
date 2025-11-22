package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example30;

// Concrete Handlers
public class NormalizationTransformer extends DataTransformer {
    @Override
    public void transform(Data data) {
        data.setContent(data
                                .getContent()
                                .toLowerCase());
        System.out.println("Normalized data: " + data.getContent());
        if (nextTransformer != null) {
            nextTransformer.transform(data);
        }
    }
}
