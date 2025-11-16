package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.internal;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example89.Validator;

public class InternalValidator implements Validator {
    public boolean validate(String cert) {
        return true;
    }
}
