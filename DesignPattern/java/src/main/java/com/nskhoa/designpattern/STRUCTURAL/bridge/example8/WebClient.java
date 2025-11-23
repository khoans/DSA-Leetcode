package com.nskhoa.designpattern.STRUCTURAL.bridge.example8;

public class WebClient extends ClientCommunicator {
    WebClient(NetworkProtocol protocol) {
        super(protocol);
    }

    public void sendData(String data) {
        protocol.send(data);
    }
}
