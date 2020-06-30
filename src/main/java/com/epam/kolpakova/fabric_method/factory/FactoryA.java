package com.epam.kolpakova.fabric_method.factory;

import com.epam.kolpakova.fabric_method.products.Product;
import com.epam.kolpakova.fabric_method.products.ProductA;

public class FactoryA extends Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
