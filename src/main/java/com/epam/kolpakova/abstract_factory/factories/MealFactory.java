package com.epam.kolpakova.abstract_factory.factories;

import com.epam.kolpakova.abstract_factory.products.drinks.Drink;
import com.epam.kolpakova.abstract_factory.products.food.Food;

public interface MealFactory {
    Food createFood();

    Drink createDrink();
}
