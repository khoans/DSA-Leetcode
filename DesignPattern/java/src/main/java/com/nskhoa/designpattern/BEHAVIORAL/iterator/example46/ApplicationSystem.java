package com.nskhoa.designpattern.BEHAVIORAL.iterator.example46;

public class ApplicationSystem {
    private final JobApplication[] applications = new JobApplication[10];
    private int count = 0;

    void addApplication(JobApplication app) {
        if (count < applications.length) {
            applications[count++] = app;
        }
    }

    MyIterator<JobApplication> createIterator() {
        return new ApplicationIterator();
    }

    private class ApplicationIterator implements MyIterator<JobApplication> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public JobApplication next() {
            return applications[index++];
        }
    }
}
