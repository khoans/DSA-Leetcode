package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

// Concrete Handlers
public class SchemaValidator extends DocumentValidator {
    @Override
    public void validate(Document document) {
        System.out.println("Schema validated.");
        if (nextValidator != null) nextValidator.validate(document);
    }
}
