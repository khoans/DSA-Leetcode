package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.owasp;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.ApplicationFirewallAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.Filter;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.Logger;

public class OWASPFactory implements ApplicationFirewallAbstractFactory {
    public Filter createFilter() {
        return new OWASPFilter();
    }

    public Logger createLogger() {
        return new OWASPLogger();
    }
}
