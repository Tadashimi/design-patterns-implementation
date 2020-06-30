package com.epam.kolpakova.fabric_method.factory;


import com.epam.kolpakova.fabric_method.products.Product;
import com.epam.kolpakova.fabric_method.products.ProductB;

public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
