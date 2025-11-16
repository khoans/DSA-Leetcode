package com.nskhoa.designpattern.creational.prototype.example15;

import java.util.HashMap;
import java.util.Map;

public class ApiRequest implements Cloneable {
    private String endpoint;
    private Map<String, String> headers;
    private Map<String, Object> params;
    private String method;

    @Override
    public ApiRequest clone() {
        try {
            ApiRequest cloned = (ApiRequest) super.clone();
            cloned.headers = new HashMap<>(this.headers);
            cloned.params = new HashMap<>(this.params);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public ApiRequest() {
        this.headers = new HashMap<>();
        this.params = new HashMap<>();
        this.method = "GET";
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    public void addParam(String key, Object value) {
        this.params.put(key, value);
    }


    // Usage
    public static void main(String[] args) {
        ApiRequest baseRequest = new ApiRequest();
        baseRequest.setEndpoint("/api/users");
        baseRequest.addHeader("Authorization", "Bearer token");

        ApiRequest getUserRequest = baseRequest.clone();
        getUserRequest.addParam("id", "123");

        ApiRequest listUsersRequest = baseRequest.clone();
        listUsersRequest.addParam("page", 1);
        listUsersRequest.addParam("limit", 20);
    }
}
