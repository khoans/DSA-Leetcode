package com.nskhoa.designpattern.BEHAVIORAL.iterator.example44;

public class CourseModuleDemo {
    public static void main(String[] args) {
        Course course = new Course();
        course.addModule(new Module("Basics"));
        course.addModule(new Module("Advanced Topics"));

        MyIterator<Module> it = course.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getName());
        }
    }
}

