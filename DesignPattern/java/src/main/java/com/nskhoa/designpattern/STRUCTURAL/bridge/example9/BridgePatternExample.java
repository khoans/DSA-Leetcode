package com.nskhoa.designpattern.STRUCTURAL.bridge.example9;

public class BridgePatternExample {
    public static void main(String[] args) {
        DataStorage sqlStorage = new SQLStorage();
        DataStorage noSqlStorage = new NoSQLStorage();

        Repository userRepoSql = new UserRepository(sqlStorage);
        Repository userRepoNoSql = new UserRepository(noSqlStorage);

        userRepoSql.saveData("User data for SQL");
        userRepoNoSql.saveData("User data for NoSQL");
    }
}
