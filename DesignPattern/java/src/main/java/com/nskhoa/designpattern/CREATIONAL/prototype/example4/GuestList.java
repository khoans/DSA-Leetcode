package com.nskhoa.designpattern.CREATIONAL.prototype.example4;

import java.util.ArrayList;
import java.util.List;

public class GuestList implements Cloneable {
    private String event;
    private List<String> guests = new ArrayList<>();

    public GuestList(String event) {
        this.event = event;
    }

    public void addGuest(String guest) {
        guests.add(guest);
    }

    public GuestList clone() {
        try {
            GuestList cloned = (GuestList) super.clone(); cloned.guests = new ArrayList<>(guests); return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        GuestList birthdayParty = new GuestList("Birthday Party");
        birthdayParty.addGuest("Alice");
        birthdayParty.addGuest("Bob");
        birthdayParty.addGuest("Charlie");

        GuestList clonedGuestList = birthdayParty.clone();
        clonedGuestList.addGuest("David");

        System.out.println("Original Guest List: " + birthdayParty.guests);
        System.out.println("Cloned Guest List: " + clonedGuestList.guests);
    }
}
