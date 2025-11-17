package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class Runner {
    public static void main(String[] args) {
        NetworkAbstractFactory httpFactory = new HTTPFactory();
        Protocol httpProtocol = httpFactory.createProtocol();
        Handler httpHandler = httpFactory.createHandler();
        httpProtocol.send("Hello via HTTP");
        httpHandler.receive("Hello via HTTP");

        NetworkAbstractFactory ftpFactory = new FTPFactory();
        Protocol ftpProtocol = ftpFactory.createProtocol();
        Handler ftpHandler = ftpFactory.createHandler();
        ftpProtocol.send("Hello via FTP");
        ftpHandler.receive("Hello via FTP");
    }
}
