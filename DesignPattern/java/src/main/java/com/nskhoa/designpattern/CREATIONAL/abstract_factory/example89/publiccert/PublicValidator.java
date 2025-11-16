package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.publiccert;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Validator;

public class PublicValidator implements Validator {
    public boolean validate(String cert) {
        return true;
    }
}
