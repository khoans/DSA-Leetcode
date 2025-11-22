package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

public class BusinessRulesValidator extends DocumentValidator {
    @Override
    public void validate(Document document) {
        System.out.println("Business rules validated.");
        if (nextValidator != null) nextValidator.validate(document);
    }
}
