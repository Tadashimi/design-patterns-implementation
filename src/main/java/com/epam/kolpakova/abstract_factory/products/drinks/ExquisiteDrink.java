package com.epam.kolpakova.abstract_factory.products.drinks;

public class ExquisiteDrink implements Drink {
    @Override
    public void order() {
        System.out.println("You ordered exquisite drink");
    }
}
