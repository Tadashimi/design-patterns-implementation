package com.epam.kolpakova.abstract_factory.factories;

import com.epam.kolpakova.abstract_factory.products.drinks.Drink;
import com.epam.kolpakova.abstract_factory.products.drinks.ExquisiteDrink;
import com.epam.kolpakova.abstract_factory.products.food.Food;
import com.epam.kolpakova.abstract_factory.products.food.ExquisiteFood;

public class ExquisiteFoodFactory implements MealFactory {
    @Override
    public Food createFood() {
        return new ExquisiteFood();
    }

    @Override
    public Drink createDrink() {
        return new ExquisiteDrink();
    }
}
