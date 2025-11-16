package com.nskhoa.designpattern.creational.factory_method.example5.factory.math;

import com.nskhoa.designpattern.creational.factory_method.example5.factory.Exam;

public class MathExam implements Exam {
    @Override
    public String getType() {
        return "math";
    }
}
