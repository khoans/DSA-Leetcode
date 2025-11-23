package com.nskhoa.designpattern.STRUCTURAL.adapter.example16;

public class RestAdapter implements WebServiceClient {
    private RestClient restClient = new RestClient();

    public String request(String endpoint) {
        return restClient.restGet(endpoint);
    }
}
