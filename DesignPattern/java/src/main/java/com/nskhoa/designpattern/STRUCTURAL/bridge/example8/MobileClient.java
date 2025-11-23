package com.nskhoa.designpattern.STRUCTURAL.bridge.example8;

public class MobileClient extends ClientCommunicator {
    MobileClient(NetworkProtocol protocol) {
        super(protocol);
    }

    public void sendData(String data) {
        protocol.send(data);
    }
}
