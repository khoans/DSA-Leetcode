package com.nskhoa.designpattern.creational.factory_method.example11.factory.postgressql;

import com.nskhoa.designpattern.creational.factory_method.example11.factory.Connection;

public class PostgreSQLConnection implements Connection {
    public String getType() {
        return "PostgreSQL";
    }
}
