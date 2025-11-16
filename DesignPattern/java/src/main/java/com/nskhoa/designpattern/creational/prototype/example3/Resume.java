package com.nskhoa.designpattern.creational.prototype.example3;

import java.util.ArrayList;
import java.util.List;

public class Resume implements Cloneable {
    private String name;
    private List<String> skills = new ArrayList<>();

    public Resume(String name) {
        this.name = name;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public Resume clone() {
        try {
            Resume cloned = (Resume) super.clone(); cloned.skills = new ArrayList<>(skills); return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Resume johnResume = new Resume("John Doe");
        johnResume.addSkill("Java");
        johnResume.addSkill("Design Patterns");
        johnResume.addSkill("Problem Solving");

        Resume clonedResume = johnResume.clone();
        clonedResume.addSkill("Project Management");

        System.out.println("John's Resume Skills: " + johnResume.skills);
        System.out.println("Cloned Resume Skills: " + clonedResume.skills);
    }
}
