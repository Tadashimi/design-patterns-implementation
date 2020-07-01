package com.epam.kolpakova.abstract_factory.products.food;

public class FastFood implements Food {
    @Override
    public void order() {
        System.out.println("You ordered fast food");
    }
}
