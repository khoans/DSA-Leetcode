package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

// Concrete Handlers
public class SizeValidator extends FileValidator {
    @Override
    public void validate(FileUpload file) {
        if (file.getSizeInMB() <= 10) {
            System.out.println("Size validation passed.");
            if (nextValidator != null) nextValidator.validate(file);
        } else {
            System.out.println("File too large.");
        }
    }
}
