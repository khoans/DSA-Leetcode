package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example37;

// Usage: ValidationAbstractFactory factory = new EmailFactory(); Validator val = factory.createValidator(); val.validate("user@example.com");
public class Runner {
    public static void main(String[] args) {
        ValidationAbstractFactory factory = new EmailFactory();
        Validator validator = factory.createValidator();
        Sanitizer sanitizer = factory.createSanitizer();

        String email = "abc@gmail.com";
        if (validator.validate(email)) {
            System.out.println(sanitizer.sanitize(email));
        }
    }
}
