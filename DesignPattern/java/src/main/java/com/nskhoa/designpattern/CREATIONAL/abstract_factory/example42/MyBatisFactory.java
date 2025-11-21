package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class MyBatisFactory implements ORMAbstractFactory {
    public Entity createEntity() {
        return new MyBatisEntity();
    }

    public QueryBuilder createQueryBuilder() {
        return new MyBatisQueryBuilder();
    }
}
