package com.nskhoa.designpattern.BEHAVIORAL.iterator.example46;

public class JobApplicationDemo {
    public static void main(String[] args) {
        ApplicationSystem system = new ApplicationSystem();
        system.addApplication(new JobApplication("Alice"));
        system.addApplication(new JobApplication("Bob"));

        MyIterator<JobApplication> it = system.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getApplicantName());
        }
    }
}

