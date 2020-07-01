package com.epam.kolpakova.abstract_factory.factories;

import com.epam.kolpakova.abstract_factory.products.drinks.Drink;
import com.epam.kolpakova.abstract_factory.products.drinks.FastDrink;
import com.epam.kolpakova.abstract_factory.products.food.Food;
import com.epam.kolpakova.abstract_factory.products.food.FastFood;

public class FastFoodFactory implements MealFactory{
    @Override
    public Food createFood() {
        return new FastFood();
    }

    @Override
    public Drink createDrink() {
        return new FastDrink();
    }
}
