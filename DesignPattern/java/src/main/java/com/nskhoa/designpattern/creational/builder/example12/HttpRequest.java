package com.nskhoa.designpattern.creational.builder.example12;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String endpoint;  // Bắt buộc
    private final String method;    // Bắt buộc, e.g., "GET", "POST"
    private Map<String, String> headers = new HashMap<>();  // Tùy chọn
    private Map<String, String> params = new HashMap<>();   // Tùy chọn
    private String body;            // Tùy chọn

    private HttpRequest(Builder builder) {
        this.endpoint = builder.endpoint;
        this.method = builder.method;
        this.headers = builder.headers;
        this.params = builder.params;
        this.body = builder.body;
    }

    public static class Builder {
        private final String endpoint;
        private final String method;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> params = new HashMap<>();
        private String body;

        public Builder(String endpoint, String method) {
            this.endpoint = endpoint;
            this.method = method;
        }

        public Builder header(String key, String value) {
            headers.put(key, value);
            return this;
        }

        public Builder param(String key, String value) {
            params.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

    // Getters...
    public String getEndpoint() {
        return endpoint;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public String getBody() {
        return body;
    }

    public static void main(String[] args) {
        // Sử dụng trong Spring Boot controller hoặc service:
        HttpRequest request = new HttpRequest.Builder("/api/users", "POST")
                .header("Authorization", "Bearer token")
                .param("id", "123")
                .body("{\"name\":\"John\"}")
                .build();

        System.out.println("HTTP Request:");
        System.out.println("Endpoint: " + request.getEndpoint());
        System.out.println("Method: " + request.getMethod());
        System.out.println("Headers: " + request.getHeaders());
        System.out.println("Params: " + request.getParams());
        System.out.println("Body: " + request.getBody());
    }
}

