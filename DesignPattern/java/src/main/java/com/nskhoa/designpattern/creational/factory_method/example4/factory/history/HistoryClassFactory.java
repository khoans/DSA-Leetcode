package com.nskhoa.designpattern.creational.factory_method.example4.factory.history;

import com.nskhoa.designpattern.creational.factory_method.example4.factory.ClassFactory;
import com.nskhoa.designpattern.creational.factory_method.example4.factory.Lesson;

public class HistoryClassFactory extends ClassFactory {
    public Lesson createLesson() {
        return new HistoryLesson();
    }
}
