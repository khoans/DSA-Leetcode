package com.nskhoa.designpattern.STRUCTURAL.bridge.example8;

public class BridgePatternExample8 {
    public static void main(String[] args) {
        ClientCommunicator mobileTcp = new MobileClient(new TCPProtocol());
        mobileTcp.sendData("Hello from Mobile via TCP");

        ClientCommunicator webUdp = new WebClient(new UDPProtocol());
        webUdp.sendData("Hello from Web via UDP");
    }
}
