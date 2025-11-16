package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89;

public interface CertificateAuthorityAbstractFactory {
    Issuer createIssuer();

    Validator createValidator();
}
