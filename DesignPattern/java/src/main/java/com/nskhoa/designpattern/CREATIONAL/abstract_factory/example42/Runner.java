package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

// Usage: ORMAbstractFactory factory = new HibernateFactory(); Entity entity = factory.createEntity(); entity.persist("user");
public class Runner {
    public static void main(String[] args) {
        ORMAbstractFactory factory = new HibernateFactory();
        Entity entity = factory.createEntity();
        QueryBuilder queryBuilder = factory.createQueryBuilder();

        entity.persist("User Data");
        System.out.println(queryBuilder.build("SELECT * FROM users"));
    }
}
