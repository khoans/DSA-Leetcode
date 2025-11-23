package com.nskhoa.designpattern.BEHAVIORAL.iterator.example22;

public class ProductCatalogDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Product("Laptop", 999.99));
        catalog.addProduct(new Product("Phone", 499.99));

        MyIterator<Product> it = catalog.createIterator();
        while (it.hasNext()) {
            Product product = it.next();
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }
}
