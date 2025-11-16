package com.nskhoa.designpattern.creational.factory_method.example10.factory.electronic;

import com.nskhoa.designpattern.creational.factory_method.example10.factory.Product;
import com.nskhoa.designpattern.creational.factory_method.example10.factory.ProductFactory;

public class ElectronicsProductFactory extends ProductFactory {
    public Product createProduct() {
        return new ElectronicsProduct();
    }
}
