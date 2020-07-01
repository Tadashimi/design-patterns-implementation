package com.epam.kolpakova.abstract_factory.products.food;

public class ExquisiteFood implements Food {
    @Override
    public void order() {
        System.out.println("You ordered exquisite food");
    }
}
