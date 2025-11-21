package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public interface ORMAbstractFactory {
    Entity createEntity();

    QueryBuilder createQueryBuilder();
}
