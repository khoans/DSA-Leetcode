package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.internal;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.CertificateAuthorityAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Issuer;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Validator;

public class InternalFactory implements CertificateAuthorityAbstractFactory {
    public Issuer createIssuer() {
        return new InternalIssuer();
    }

    public Validator createValidator() {
        return new InternalValidator();
    }
}

