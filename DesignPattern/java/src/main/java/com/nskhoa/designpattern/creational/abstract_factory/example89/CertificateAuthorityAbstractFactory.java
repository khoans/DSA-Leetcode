package com.nskhoa.designpattern.creational.abstract_factory.example89;

public interface CertificateAuthorityAbstractFactory {
    Issuer createIssuer();

    Validator createValidator();
}
