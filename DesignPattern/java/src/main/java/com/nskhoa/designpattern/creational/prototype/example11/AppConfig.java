package com.nskhoa.designpattern.creational.prototype.example11;

public class AppConfig implements Cloneable {
    private String environment;
    private String dbUrl;
    private int maxConnections;
    private boolean debugMode;

    @Override
    public AppConfig clone() {
        try {
            return (AppConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    // Usage
    public static void main(String[] args) {
        AppConfig devConfig = new AppConfig();
        devConfig.setEnvironment("dev");
        devConfig.setDbUrl("localhost:3306");

        AppConfig prodConfig = devConfig.clone();
        prodConfig.setEnvironment("prod");
        prodConfig.setDbUrl("prod-db.example.com:3306");
    }
}

