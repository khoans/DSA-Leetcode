package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

// Client runner
public class FileUploadValidationDemo {
    public static void main(String[] args) {
        FileValidator sizeValidator = new SizeValidator();
        FileValidator typeValidator = new TypeValidator();
        FileValidator virusValidator = new VirusScanValidator();

        sizeValidator.setNextValidator(typeValidator);
        typeValidator.setNextValidator(virusValidator);

        FileUpload file1 = new FileUpload(8, "jpg", false);
        FileUpload file2 = new FileUpload(12, "png", false);
        FileUpload file3 = new FileUpload(5, "exe", false);
        FileUpload file4 = new FileUpload(2, "png", true);

        System.out.println("Testing file1:");
        sizeValidator.validate(file1);

        System.out.println("\nTesting file2:");
        sizeValidator.validate(file2);

        System.out.println("\nTesting file3:");
        sizeValidator.validate(file3);

        System.out.println("\nTesting file4:");
        sizeValidator.validate(file4);
    }
}

