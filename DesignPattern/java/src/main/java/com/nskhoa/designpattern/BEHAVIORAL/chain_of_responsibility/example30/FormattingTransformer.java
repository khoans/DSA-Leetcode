package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example30;

public class FormattingTransformer extends DataTransformer {
    @Override
    public void transform(Data data) {
        data.setContent(data
                                .getContent()
                                .toUpperCase());
        System.out.println("Formatted data: " + data.getContent());
    }
}
