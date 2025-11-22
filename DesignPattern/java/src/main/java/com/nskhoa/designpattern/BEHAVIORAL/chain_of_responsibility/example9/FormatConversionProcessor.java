package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example9;

public class FormatConversionProcessor extends DocumentProcessor {
    @Override
    public void process(Document document) {
        System.out.println("Converting document format...");
        // Simulate conversion step
        document.setContent(document.getContent() + " [converted]");
        if (nextProcessor != null) {
            nextProcessor.process(document);
        }
    }
}
