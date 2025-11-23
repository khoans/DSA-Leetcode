package com.nskhoa.designpattern.STRUCTURAL.bridge.example16;

public abstract class CMSClient {
    protected CMSSystem cms;
    protected CMSClient(CMSSystem cms) { this.cms = cms; }
    abstract void display();
}
