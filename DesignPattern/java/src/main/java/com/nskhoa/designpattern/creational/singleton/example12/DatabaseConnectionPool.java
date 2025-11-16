package com.nskhoa.designpattern.CREATIONAL.singleton.example12;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private static final int MAX_POOL_SIZE = 10;
    private List<String> availableConnections;
    private List<String> usedConnections;

    private DatabaseConnectionPool() {
        availableConnections = new ArrayList<>();
        usedConnections = new ArrayList<>();
        // Khởi tạo pool với 5 connection ban đầu
        for (int i = 0; i < 5; i++) {
            availableConnections.add("Connection-" + i);
        }
        System.out.println("DatabaseConnectionPool initialized with " + availableConnections.size() + " connections");
    }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public synchronized String getConnection() {
        if (availableConnections.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                String newConn = "Connection-" + (availableConnections.size() + usedConnections.size());
                usedConnections.add(newConn);
                System.out.println("Created new connection: " + newConn);
                return newConn;
            } else {
                System.out.println("No available connections. Pool is full!");
                return null;
            }
        }

        String connection = availableConnections.remove(0);
        usedConnections.add(connection);
        System.out.println("Retrieved connection: " + connection);
        return connection;
    }

    public synchronized void releaseConnection(String connection) {
        if (usedConnections.remove(connection)) {
            availableConnections.add(connection);
            System.out.println("Released connection: " + connection);
        }
    }

    public void showPoolStatus() {
        System.out.println("Pool Status - Available: " + availableConnections.size() +
                           ", Used: " + usedConnections.size());
    }

    public static void main(String[] args) {
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();
        String conn1 = pool.getConnection();
        String conn2 = pool.getConnection();
        pool.showPoolStatus();
        pool.releaseConnection(conn1);
        pool.showPoolStatus();
    }
}
