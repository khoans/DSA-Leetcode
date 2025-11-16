package com.nskhoa.designpattern.creational.factory_method.example5.factory.math;

import com.nskhoa.designpattern.creational.factory_method.example5.factory.Exam;
import com.nskhoa.designpattern.creational.factory_method.example5.factory.ExamFactory;

public class MathExamFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new MathExam();
    }
}
