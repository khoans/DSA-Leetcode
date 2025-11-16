package com.nskhoa.designpattern.CREATIONAL.factory_method.example11;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example11.factory.Connection;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example11.factory.DatabaseFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example11.factory.mysql.MySQLFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example11.factory.postgressql.PostgreSQLFactory;

public class Runner {
    public static void main(String[] args) {
        DatabaseFactory mysqlFactory = new MySQLFactory();
        Connection mysqlConnection = mysqlFactory.createConnection();
        mysqlConnection.getType();

        DatabaseFactory postgresFactory = new PostgreSQLFactory();
        Connection postgresConnection = postgresFactory.createConnection();
        postgresConnection.getType();

    }
}
