package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

// Abstract Handler
public abstract class DocumentValidator {
    protected DocumentValidator nextValidator;

    public void setNextValidator(DocumentValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public abstract void validate(Document document);
}
