package com.epam.kolpakova.fabric_method.factory;

import com.epam.kolpakova.fabric_method.products.Product;

public abstract class Factory {
    public void doSomeStuff() {
        Product product = createProduct();
        product.doStuff();
    }

    abstract public Product createProduct();
}
