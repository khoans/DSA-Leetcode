package com.nskhoa.designpattern.STRUCTURAL.bridge.example8;

public abstract class ClientCommunicator {
    protected NetworkProtocol protocol;

    ClientCommunicator(NetworkProtocol protocol) {
        this.protocol = protocol;
    }

    abstract void sendData(String data);
}
