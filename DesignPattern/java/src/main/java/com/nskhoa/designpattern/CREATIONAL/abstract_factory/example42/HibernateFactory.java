package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class HibernateFactory implements ORMAbstractFactory {
    public Entity createEntity() {
        return new HibernateEntity();
    }

    public QueryBuilder createQueryBuilder() {
        return new HibernateQueryBuilder();
    }
}
