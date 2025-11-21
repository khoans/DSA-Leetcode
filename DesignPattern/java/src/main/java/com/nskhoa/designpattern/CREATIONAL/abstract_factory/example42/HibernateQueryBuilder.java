package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class HibernateQueryBuilder implements QueryBuilder {
    public String build(String sql) {
        return "Hibernate Query";
    }
}
