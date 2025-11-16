package com.nskhoa.designpattern.creational.prototype.example7;

import java.util.ArrayList;
import java.util.List;

public class InteriorDesign implements Cloneable {
    private String room;
    private List<String> furniture = new ArrayList<>();

    public InteriorDesign(String room) {
        this.room = room;
    }

    public void addFurniture(String furn) {
        furniture.add(furn);
    }

    public InteriorDesign clone() {
        try {
            InteriorDesign cloned = (InteriorDesign) super.clone(); cloned.furniture = new ArrayList<>(furniture);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        InteriorDesign livingRoomDesign = new InteriorDesign("Living Room");
        livingRoomDesign.addFurniture("Sofa");
        livingRoomDesign.addFurniture("Coffee Table");
        livingRoomDesign.addFurniture("TV Stand");

        InteriorDesign clonedDesign = livingRoomDesign.clone();
        clonedDesign.addFurniture("Bookshelf");

        System.out.println("Living Room Furniture: " + livingRoomDesign.furniture);
        System.out.println("Cloned Design Furniture: " + clonedDesign.furniture);
    }
}
