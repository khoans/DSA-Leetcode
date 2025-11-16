package com.nskhoa.designpattern.creational.factory_method.example5;

import com.nskhoa.designpattern.creational.factory_method.example5.factory.Exam;
import com.nskhoa.designpattern.creational.factory_method.example5.factory.ExamFactory;
import com.nskhoa.designpattern.creational.factory_method.example5.factory.math.MathExamFactory;
import com.nskhoa.designpattern.creational.factory_method.example5.factory.physic.PhysicExamFactory;

public class Runner {
    public static void main(String[] args) {
        ExamFactory mathExamFactory = new MathExamFactory();
        Exam mathExam = mathExamFactory.createExam();
        mathExam.getType();

        ExamFactory physicExamFactory = new PhysicExamFactory();
        Exam physicExam = physicExamFactory.createExam();
        physicExam.getType();
    }
}
