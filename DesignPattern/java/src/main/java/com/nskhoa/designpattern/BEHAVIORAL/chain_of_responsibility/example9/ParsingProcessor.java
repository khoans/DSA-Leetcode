package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example9;

// Concrete Handlers
public class ParsingProcessor extends DocumentProcessor {
    @Override
    public void process(Document document) {
        System.out.println("Parsing document...");
        // Simulate parsing step
        document.setContent(document.getContent() + " [parsed]");
        if (nextProcessor != null) {
            nextProcessor.process(document);
        }
    }
}
