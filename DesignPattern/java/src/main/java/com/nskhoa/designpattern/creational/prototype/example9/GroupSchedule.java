package com.nskhoa.designpattern.creational.prototype.example9;

import java.util.ArrayList;
import java.util.List;

public class GroupSchedule implements Cloneable {
    private String group;
    private List<String> classes = new ArrayList<>();

    public GroupSchedule(String group) {
        this.group = group;
    }

    public void addClass(String cls) {
        classes.add(cls);
    }

    public GroupSchedule clone() {
        try {
            GroupSchedule cloned = (GroupSchedule) super.clone(); cloned.classes = new ArrayList<>(classes);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        GroupSchedule groupASchedule = new GroupSchedule("Group A");
        groupASchedule.addClass("Math");
        groupASchedule.addClass("Science");
        groupASchedule.addClass("History");

        GroupSchedule clonedSchedule = groupASchedule.clone();
        clonedSchedule.addClass("Art");

        System.out.println("Group A Schedule: " + groupASchedule.classes);
        System.out.println("Cloned Schedule: " + clonedSchedule.classes);
    }
}
