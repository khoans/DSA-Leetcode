package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class Runner {
    public static void main(String[] args) {
        DataMaskingAbstractFactory factory = new PIIFactory();

        Masker masker = factory.createMasker();
        Validator validator = factory.createValidator();

        String sensitiveData = "MyPassword123";
        String maskedData = masker.mask(sensitiveData);

        System.out.println("Original Data: " + sensitiveData);
        System.out.println("Masked Data: " + maskedData);
        System.out.println("Is Masked: " + validator.isMasked(maskedData));
    }
}
