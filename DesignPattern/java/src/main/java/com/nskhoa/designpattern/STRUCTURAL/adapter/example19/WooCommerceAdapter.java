package com.nskhoa.designpattern.STRUCTURAL.adapter.example19;

public class WooCommerceAdapter implements ECommercePlatform {
    private WooCommerce woo = new WooCommerce();

    public void listProduct(String product) {
        woo.wooAddProduct(product);
    }
}
