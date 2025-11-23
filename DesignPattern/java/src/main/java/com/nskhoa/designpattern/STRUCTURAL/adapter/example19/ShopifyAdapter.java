package com.nskhoa.designpattern.STRUCTURAL.adapter.example19;

public class ShopifyAdapter implements ECommercePlatform {
    private Shopify shopify = new Shopify();

    public void listProduct(String product) {
        shopify.addProductToShopify(product);
    }
}
