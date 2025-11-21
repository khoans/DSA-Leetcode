package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example33;

public class iOSFactory implements MobileAbstractFactory {
    public View createView() {
        return new iOSView();
    }

    public Layout createLayout() {
        return new iOSLayout();
    }
}
