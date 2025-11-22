package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

// Abstract Handler
public abstract class FileValidator {
    protected FileValidator nextValidator;

    public void setNextValidator(FileValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public abstract void validate(FileUpload file);
}
