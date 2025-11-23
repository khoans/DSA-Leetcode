package com.nskhoa.designpattern.BEHAVIORAL.iterator.example39;

public class UserProfileDemo {
    public static void main(String[] args) {
        UserProfiles profiles = new UserProfiles();
        profiles.addProfile(new UserProfile("alice123"));
        profiles.addProfile(new UserProfile("bob456"));

        MyIterator<UserProfile> it = profiles.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getUsername());
        }
    }
}

