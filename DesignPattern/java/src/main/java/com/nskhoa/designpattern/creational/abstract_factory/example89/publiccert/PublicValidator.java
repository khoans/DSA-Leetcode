package com.nskhoa.designpattern.creational.abstract_factory.example89.publiccert;

import com.nskhoa.designpattern.creational.abstract_factory.example89.Validator;

public class PublicValidator implements Validator {
    public boolean validate(String cert) {
        return true;
    }
}
