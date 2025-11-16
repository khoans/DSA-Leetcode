package com.nskhoa.designpattern.creational.factory_method.example4;

import com.nskhoa.designpattern.creational.factory_method.example4.factory.ClassFactory;
import com.nskhoa.designpattern.creational.factory_method.example4.factory.Lesson;
import com.nskhoa.designpattern.creational.factory_method.example4.factory.history.HistoryClassFactory;
import com.nskhoa.designpattern.creational.factory_method.example4.factory.math.MathClassFactory;

public class Runner {
    public static void main(String[] args) {
        ClassFactory mathClassFactory = new MathClassFactory();
        Lesson mathLesson = mathClassFactory.createLesson();
        mathLesson.getSubject();

        ClassFactory historyClassFactory = new HistoryClassFactory();
        Lesson historyLesson = historyClassFactory.createLesson();
        historyLesson.getSubject();
    }
}
