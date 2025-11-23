package com.nskhoa.designpattern.BEHAVIORAL.iterator.example44;

public class Course {
    private final Module[] modules = new Module[10];
    private int count = 0;

    void addModule(Module m) {
        if (count < modules.length) {
            modules[count++] = m;
        }
    }

    MyIterator<Module> createIterator() {
        return new ModuleIterator();
    }

    private class ModuleIterator implements MyIterator<Module> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Module next() {
            return modules[index++];
        }
    }
}
