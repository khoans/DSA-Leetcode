package com.nskhoa.designpattern.creational.singleton.example5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private static ShoppingList instance;
    private List<String> items = new ArrayList<>();

    private ShoppingList() {
    }

    public static ShoppingList getInstance() {
        if (instance == null) {
            instance = new ShoppingList();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = ShoppingList.getInstance();
        shoppingList.addItem("Milk");
        shoppingList.addItem("Bread");
        shoppingList.addItem("Eggs");

        System.out.println("Shopping List: " + shoppingList.getItems());
    }
}
