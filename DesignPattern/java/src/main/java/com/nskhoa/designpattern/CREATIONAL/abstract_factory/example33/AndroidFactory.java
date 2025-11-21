package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example33;

public class AndroidFactory implements MobileAbstractFactory {
    public View createView() {
        return new AndroidView();
    }

    public Layout createLayout() {
        return new AndroidLayout();
    }
}
