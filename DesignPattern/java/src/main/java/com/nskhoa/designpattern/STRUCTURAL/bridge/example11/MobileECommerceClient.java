package com.nskhoa.designpattern.STRUCTURAL.bridge.example11;

// Refined abstractions
public class MobileECommerceClient extends ECommerceClient {
    public MobileECommerceClient(ProductSystem productSystem) { super(productSystem); }
    public void showProducts() {
        System.out.print("Mobile UI: ");
        productSystem.displayProducts();
    }
}
