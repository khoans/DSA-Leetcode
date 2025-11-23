package com.nskhoa.designpattern.BEHAVIORAL.iterator.example1;

public class StudentListIteratorDemo {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent(new Student("S001", "Alice"));
        classroom.addStudent(new Student("S002", "Bob"));
        classroom.addStudent(new Student("S003", "Charlie"));

        MyIterator<Student> iterator = classroom.createIterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.getId() + ": " + s.getName());
        }
    }
}

