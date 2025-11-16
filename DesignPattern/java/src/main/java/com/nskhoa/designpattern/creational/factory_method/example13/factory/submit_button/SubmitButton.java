package com.nskhoa.designpattern.creational.factory_method.example13.factory.submit_button;

import com.nskhoa.designpattern.creational.factory_method.example13.factory.Button;

public class SubmitButton implements Button {
    public void render() {
        System.out.println("Render Submit Button");
    }
}
