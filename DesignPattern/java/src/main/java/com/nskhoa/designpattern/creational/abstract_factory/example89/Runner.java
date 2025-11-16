package com.nskhoa.designpattern.creational.abstract_factory.example89;

import com.nskhoa.designpattern.creational.abstract_factory.example89.internal.InternalFactory;

public class Runner {
    public static void main(String[] args) {
        CertificateAuthorityAbstractFactory factory = new InternalFactory();
        Issuer issuer = factory.createIssuer();
        String cert = issuer.issue("csr-data");
        Validator validator = factory.createValidator();
        boolean isValid = validator.validate(cert);
        System.out.println("Is certificate valid? " + isValid);
        System.out.println(cert);

    }
}
