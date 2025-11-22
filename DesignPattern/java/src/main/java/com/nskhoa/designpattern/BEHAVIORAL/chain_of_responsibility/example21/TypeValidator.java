package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

public class TypeValidator extends FileValidator {
    @Override
    public void validate(FileUpload file) {
        if (file.getFileType().equalsIgnoreCase("jpg") || file.getFileType().equalsIgnoreCase("png")) {
            System.out.println("Type validation passed.");
            if (nextValidator != null) nextValidator.validate(file);
        } else {
            System.out.println("Invalid file type.");
        }
    }
}
