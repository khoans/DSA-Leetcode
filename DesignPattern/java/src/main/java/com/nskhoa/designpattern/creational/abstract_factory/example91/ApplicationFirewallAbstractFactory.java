package com.nskhoa.designpattern.creational.abstract_factory.example91;

public interface ApplicationFirewallAbstractFactory {
    Filter createFilter();

    Logger createLogger();
}

// ApplicationFirewallAbstractFactory factory = new OWASPFactory(); Filter filter = factory.createFilter(); boolean blocked = filter.block("sql-injection attempt");
