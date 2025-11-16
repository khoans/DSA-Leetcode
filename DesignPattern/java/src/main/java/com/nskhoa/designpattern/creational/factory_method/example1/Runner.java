package com.nskhoa.designpattern.creational.factory_method.example1;

import com.nskhoa.designpattern.creational.factory_method.example1.factory.Dish;
import com.nskhoa.designpattern.creational.factory_method.example1.factory.Restaurant;
import com.nskhoa.designpattern.creational.factory_method.example1.factory.salty_restaurant.SaltyRestaurant;

public class Runner {
    public static void main(String[] args) {
        Restaurant saltyRestaurant = new SaltyRestaurant();
        Dish saltyDish = saltyRestaurant.createDish();
        saltyDish.getType();

        Restaurant sweetRestaurant = new SaltyRestaurant();
        Dish sweetDish = sweetRestaurant.createDish();
        sweetDish.getType();
    }
}
