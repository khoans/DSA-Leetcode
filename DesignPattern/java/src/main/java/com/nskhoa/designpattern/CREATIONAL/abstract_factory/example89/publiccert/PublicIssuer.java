package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.publiccert;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Issuer;

public class PublicIssuer implements Issuer {
    public String issue(String csr) {
        return "Public Cert for " + csr;
    }
}
