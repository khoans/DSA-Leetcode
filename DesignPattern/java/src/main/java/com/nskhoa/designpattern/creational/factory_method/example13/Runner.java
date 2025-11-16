package com.nskhoa.designpattern.creational.factory_method.example13;

import com.nskhoa.designpattern.creational.factory_method.example13.factory.Button;
import com.nskhoa.designpattern.creational.factory_method.example13.factory.UIButtonFactory;
import com.nskhoa.designpattern.creational.factory_method.example13.factory.reset_button.ResetButtonFactory;
import com.nskhoa.designpattern.creational.factory_method.example13.factory.submit_button.SubmitButtonFactory;

public class Runner {
    public static void main(String[] args) {
        UIButtonFactory submitButtonFactory = new SubmitButtonFactory();
        Button submitButton = submitButtonFactory.createButton();
        submitButton.render();

        UIButtonFactory resetButtonFactory = new ResetButtonFactory();
        Button resetButton = resetButtonFactory.createButton();
        resetButton.render();
    }
}
