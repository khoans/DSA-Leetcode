package com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.clothing;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.Product;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.ProductFactory;

public class ClothingProductFactory extends ProductFactory {
    public Product createProduct() {
        return new ClothingProduct();
    }
}
