package com.nskhoa.designpattern.CREATIONAL.factory_method.example5.factory.physic;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example5.factory.Exam;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example5.factory.ExamFactory;

public class PhysicExamFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new PhysicExam();
    }
}
