package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class MyBatisQueryBuilder implements QueryBuilder {
    public String build(String sql) {
        return "MyBatis Query";
    }
}
