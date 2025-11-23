package com.nskhoa.designpattern.STRUCTURAL.bridge.example11;

public class DesktopECommerceClient extends ECommerceClient {
    public DesktopECommerceClient(ProductSystem productSystem) { super(productSystem); }
    public void showProducts() {
        System.out.print("Desktop UI: ");
        productSystem.displayProducts();
    }
}
