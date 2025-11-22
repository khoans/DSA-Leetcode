package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

// Client runner
public class DocumentValidationDemo {
    public static void main(String[] args) {
        DocumentValidator schemaValidator = new SchemaValidator();
        DocumentValidator businessValidator = new BusinessRulesValidator();
        DocumentValidator referenceValidator = new ReferenceValidator();

        schemaValidator.setNextValidator(businessValidator);
        businessValidator.setNextValidator(referenceValidator);

        Document document = new Document("doc content");
        schemaValidator.validate(document);
    }
}

