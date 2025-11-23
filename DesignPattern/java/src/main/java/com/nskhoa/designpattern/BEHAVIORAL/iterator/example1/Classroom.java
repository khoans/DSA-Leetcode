package com.nskhoa.designpattern.BEHAVIORAL.iterator.example1;

public class Classroom {
    private final Student[] students = new Student[10];
    private int count = 0;
    void addStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
        }
    }
    MyIterator<Student> createIterator() {
        return new ClassroomIterator();
    }

    private class ClassroomIterator implements MyIterator<Student> {
        private int index = 0;
        public boolean hasNext() {
            return index < count;
        }
        public Student next() {
            return students[index++];
        }
    }
}
