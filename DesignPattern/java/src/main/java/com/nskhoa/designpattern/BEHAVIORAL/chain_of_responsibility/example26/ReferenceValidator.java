package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

public class ReferenceValidator extends DocumentValidator {
    @Override
    public void validate(Document document) {
        System.out.println("Reference integrity validated.");
    }
}
