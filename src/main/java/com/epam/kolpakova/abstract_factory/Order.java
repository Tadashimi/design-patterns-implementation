package com.epam.kolpakova.abstract_factory;

import com.epam.kolpakova.abstract_factory.factories.MealFactory;
import com.epam.kolpakova.abstract_factory.products.drinks.Drink;
import com.epam.kolpakova.abstract_factory.products.food.Food;

public class Order {
    private Food food;
    private Drink drink;

    public Order(MealFactory mealFactory) {
        food = mealFactory.createFood();
        drink = mealFactory.createDrink();
    }

    public void order() {
        food.order();
        drink.order();
    }
}
