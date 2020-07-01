package com.epam.kolpakova.abstract_factory.products.drinks;

public class FastDrink implements Drink {
    @Override
    public void order() {
        System.out.println("You ordered fast drink");
    }
}
