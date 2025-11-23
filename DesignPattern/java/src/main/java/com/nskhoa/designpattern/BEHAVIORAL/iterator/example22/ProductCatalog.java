package com.nskhoa.designpattern.BEHAVIORAL.iterator.example22;

public class ProductCatalog {
    private final Product[] products = new Product[10];
    private int count = 0;

    void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        }
    }

    MyIterator<Product> createIterator() {
        return new ProductCatalogIterator();
    }

    private class ProductCatalogIterator implements MyIterator<Product> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Product next() {
            return products[index++];
        }
    }
}
