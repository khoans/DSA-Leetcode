package com.nskhoa.designpattern.CREATIONAL.builder.example11;

public class DatabaseConfig {
    private final String url;      // Bắt buộc
    private final String username; // Bắt buộc
    private final String password; // Tùy chọn
    private final int poolSize;    // Tùy chọn, default 10
    private final int timeout;     // Tùy chọn, default 30

    private DatabaseConfig(Builder builder) {
        this.url = builder.url;
        this.username = builder.username;
        this.password = builder.password;
        this.poolSize = builder.poolSize;
        this.timeout = builder.timeout;
    }

    public static class Builder {
        private final String url;
        private final String username;
        private String password;
        private int poolSize = 10;
        private int timeout = 30;

        public Builder(String url, String username) {
            this.url = url;
            this.username = username;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder poolSize(int poolSize) {
            this.poolSize = poolSize;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public DatabaseConfig build() {
            return new DatabaseConfig(this);
        }
    }

    // Getters...
    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public int getTimeout() {
        return timeout;
    }

    public static void main(String[] args) {
        // Sử dụng trong Spring Boot service:
        DatabaseConfig config = new DatabaseConfig.Builder("jdbc:mysql://localhost:3306/mydb", "root")
                .password("secret")
                .poolSize(20)
                .timeout(60)
                .build();

        System.out.println("Database Config:");
        System.out.println("URL: " + config.getUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());
        System.out.println("Pool Size: " + config.getPoolSize());
        System.out.println("Timeout: " + config.getTimeout() + " seconds");
    }
}

