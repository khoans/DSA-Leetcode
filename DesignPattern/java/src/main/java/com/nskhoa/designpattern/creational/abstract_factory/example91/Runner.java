package com.nskhoa.designpattern.creational.abstract_factory.example91;

import com.nskhoa.designpattern.creational.abstract_factory.example91.owasp.OWASPFactory;

public class Runner {
    public static void main(String[] args) {
        ApplicationFirewallAbstractFactory factory = new OWASPFactory();
        Filter filter = factory.createFilter();
        Logger logger = factory.createLogger();
        boolean blocked = filter.block("sql-injection attempt");
        logger.log("Request blocked: " + blocked);
    }
}
