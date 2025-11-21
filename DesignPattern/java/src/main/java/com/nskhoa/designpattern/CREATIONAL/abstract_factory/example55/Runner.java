package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example55;

public class Runner {
    public static void main(String[] args) {
        DocumentBuilderAbstractFactory factory = new StandardFactory();
        Builder builder = factory.createBuilder();
        Validator validator = factory.createValidator();

        Document doc = builder.build("<root/>");
        boolean isValid = validator.validate(doc);

        System.out.println("Document Type: " + doc.getType());
        System.out.println("Is Valid: " + isValid);
    }
}
