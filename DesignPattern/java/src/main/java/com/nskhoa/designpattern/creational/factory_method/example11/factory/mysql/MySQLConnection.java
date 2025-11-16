package com.nskhoa.designpattern.creational.factory_method.example11.factory.mysql;

import com.nskhoa.designpattern.creational.factory_method.example11.factory.Connection;

public class MySQLConnection implements Connection {
    public String getType() {
        return "MySQL";
    }
}
