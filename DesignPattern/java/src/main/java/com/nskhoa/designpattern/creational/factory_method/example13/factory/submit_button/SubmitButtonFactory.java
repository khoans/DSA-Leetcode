package com.nskhoa.designpattern.creational.factory_method.example13.factory.submit_button;

import com.nskhoa.designpattern.creational.factory_method.example13.factory.Button;
import com.nskhoa.designpattern.creational.factory_method.example13.factory.UIButtonFactory;

public class SubmitButtonFactory extends UIButtonFactory {
    public Button createButton() {
        return new SubmitButton();
    }
}
