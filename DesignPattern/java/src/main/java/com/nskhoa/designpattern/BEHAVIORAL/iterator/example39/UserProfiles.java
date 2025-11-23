package com.nskhoa.designpattern.BEHAVIORAL.iterator.example39;

public class UserProfiles {
    private final UserProfile[] profiles = new UserProfile[10];
    private int count = 0;

    void addProfile(UserProfile p) {
        if (count < profiles.length) {
            profiles[count++] = p;
        }
    }

    MyIterator<UserProfile> createIterator() {
        return new ProfileIterator();
    }

    private class ProfileIterator implements MyIterator<UserProfile> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public UserProfile next() {
            return profiles[index++];
        }
    }
}
