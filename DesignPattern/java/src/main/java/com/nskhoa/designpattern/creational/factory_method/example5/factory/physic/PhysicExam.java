package com.nskhoa.designpattern.creational.factory_method.example5.factory.physic;

import com.nskhoa.designpattern.creational.factory_method.example5.factory.Exam;

public class PhysicExam implements Exam {
    @Override
    public String getType() {
        return "Physic";
    }
}
