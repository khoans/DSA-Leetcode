package com.nskhoa.designpattern.STRUCTURAL.adapter.example16;

public class SoapAdapter implements WebServiceClient {
    private SoapClient soapClient = new SoapClient();

    public String request(String endpoint) {
        return soapClient.soapCall(endpoint);
    }
}
