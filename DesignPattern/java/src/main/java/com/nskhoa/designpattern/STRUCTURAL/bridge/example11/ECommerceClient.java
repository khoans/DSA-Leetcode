package com.nskhoa.designpattern.STRUCTURAL.bridge.example11;

// Abstraction
public abstract class ECommerceClient {
    protected ProductSystem productSystem;
    protected ECommerceClient(ProductSystem productSystem) {
        this.productSystem = productSystem;
    }
    abstract void showProducts();
}
