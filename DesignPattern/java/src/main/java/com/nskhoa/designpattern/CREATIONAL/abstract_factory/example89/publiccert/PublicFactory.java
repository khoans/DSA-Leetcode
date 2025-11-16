package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.publiccert;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.CertificateAuthorityAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Issuer;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Validator;

public class PublicFactory implements CertificateAuthorityAbstractFactory {
    public Issuer createIssuer() {
        return new PublicIssuer();
    }

    public Validator createValidator() {
        return new PublicValidator();
    }
}
