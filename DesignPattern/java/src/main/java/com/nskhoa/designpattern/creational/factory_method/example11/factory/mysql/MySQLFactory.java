package com.nskhoa.designpattern.creational.factory_method.example11.factory.mysql;

import com.nskhoa.designpattern.creational.factory_method.example11.factory.Connection;
import com.nskhoa.designpattern.creational.factory_method.example11.factory.DatabaseFactory;

public class MySQLFactory extends DatabaseFactory {
    public Connection createConnection() {
        return new MySQLConnection();
    }
}
