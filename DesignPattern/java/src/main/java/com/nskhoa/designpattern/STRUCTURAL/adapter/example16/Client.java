package com.nskhoa.designpattern.STRUCTURAL.adapter.example16;

public class Client {
    private WebServiceClient webServiceClient;

    public Client(WebServiceClient webServiceClient) {
        this.webServiceClient = webServiceClient;
    }

    public void fetchData(String endpoint) {
        String response = webServiceClient.request(endpoint);
        System.out.println(response);
    }

    public static void main(String[] args) {
        WebServiceClient restAdapter = new RestAdapter();
        Client restClient = new Client(restAdapter);
        restClient.fetchData("/rest-endpoint");

        WebServiceClient soapAdapter = new SoapAdapter();
        Client soapClient = new Client(soapAdapter);
        soapClient.fetchData("/soap-endpoint");
    }
}
