package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example37;

public class EmailFactory implements ValidationAbstractFactory {
    public Validator createValidator() {
        return new EmailValidator();
    }

    public Sanitizer createSanitizer() {
        return new EmailSanitizer();
    }
}
