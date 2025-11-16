package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.internal;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Issuer;

public class InternalIssuer implements Issuer {
    public String issue(String csr) {
        return "Internal Cert for " + csr;
    }
}
