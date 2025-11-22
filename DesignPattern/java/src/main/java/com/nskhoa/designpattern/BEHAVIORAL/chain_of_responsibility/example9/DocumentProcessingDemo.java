package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example9;

// Client runner
public class DocumentProcessingDemo {
    public static void main(String[] args) {
        DocumentProcessor parser = new ParsingProcessor();
        DocumentProcessor validator = new ValidationProcessor();
        DocumentProcessor converter = new FormatConversionProcessor();

        parser.setNextProcessor(validator);
        validator.setNextProcessor(converter);

        Document doc = new Document("Original content");
        parser.process(doc);

        System.out.println("Final document content: " + doc.getContent());
    }
}

