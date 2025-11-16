package com.nskhoa.designpattern.CREATIONAL.singleton.example6;

public class HouseKey {
    private static HouseKey instance;
    private boolean locked = true;

    private HouseKey() {
    }

    public static HouseKey getInstance() {
        if (instance == null) {
            instance = new HouseKey();
        }
        return instance;
    }

    public void unlock() {
        locked = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public static void main(String[] args) {
        HouseKey houseKey = HouseKey.getInstance();
        System.out.println("Is the house locked? " + houseKey.isLocked());
        houseKey.unlock();
        System.out.println("Is the house locked? " + houseKey.isLocked());
    }
}
