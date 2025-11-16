package com.nskhoa.designpattern.creational.singleton.example14;

public class AppConfiguration {
    private static AppConfiguration instance;
    private String appName;
    private String version;
    private String environment;

    private AppConfiguration() {
        // Load configuration from file or environment variables
        this.appName = "MyApplication";
        this.version = "1.0.0";
        this.environment = "production";
    }

    public static synchronized AppConfiguration getInstance() {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }

    public static void main(String[] args) {
        AppConfiguration config = AppConfiguration.getInstance();
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Environment: " + config.getEnvironment());
    }
}
