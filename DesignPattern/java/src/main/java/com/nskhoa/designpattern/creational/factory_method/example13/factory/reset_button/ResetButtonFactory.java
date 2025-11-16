package com.nskhoa.designpattern.CREATIONAL.factory_method.example13.factory.reset_button;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example13.factory.Button;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example13.factory.UIButtonFactory;

public class ResetButtonFactory extends UIButtonFactory {
    public Button createButton() {
        return new ResetButton();
    }
}
