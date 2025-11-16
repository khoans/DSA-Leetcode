package com.nskhoa.designpattern.CREATIONAL.factory_method.example4.factory.math;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example4.factory.ClassFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example4.factory.Lesson;

public class MathClassFactory extends ClassFactory {
    public Lesson createLesson() {
        return new MathLesson();
    }
}
