package com.nskhoa.designpattern.creational.abstract_factory.example91.custom;

import com.nskhoa.designpattern.creational.abstract_factory.example91.ApplicationFirewallAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example91.Filter;
import com.nskhoa.designpattern.creational.abstract_factory.example91.Logger;

public class CustomFactory implements ApplicationFirewallAbstractFactory {
    public Filter createFilter() {
        return new CustomFilter();
    }

    public Logger createLogger() {
        return new CustomLogger();
    }
}
