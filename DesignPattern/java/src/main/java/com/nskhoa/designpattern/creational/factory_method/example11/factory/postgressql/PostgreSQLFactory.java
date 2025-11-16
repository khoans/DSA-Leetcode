package com.nskhoa.designpattern.creational.factory_method.example11.factory.postgressql;

import com.nskhoa.designpattern.creational.factory_method.example11.factory.Connection;
import com.nskhoa.designpattern.creational.factory_method.example11.factory.DatabaseFactory;

public class PostgreSQLFactory extends DatabaseFactory {
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }
}
