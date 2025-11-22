package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

// Request class
public class Request {
    private String url;

    public Request(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
