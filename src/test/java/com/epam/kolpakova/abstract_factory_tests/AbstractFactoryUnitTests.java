package com.epam.kolpakova.abstract_factory_tests;

import com.epam.kolpakova.abstract_factory.factories.ExquisiteFoodFactory;
import com.epam.kolpakova.abstract_factory.factories.FastFoodFactory;
import com.epam.kolpakova.abstract_factory.factories.MealFactory;
import com.epam.kolpakova.abstract_factory.products.drinks.ExquisiteDrink;
import com.epam.kolpakova.abstract_factory.products.drinks.FastDrink;
import com.epam.kolpakova.abstract_factory.products.food.ExquisiteFood;
import com.epam.kolpakova.abstract_factory.products.food.FastFood;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AbstractFactoryUnitTests {
    @Test
    static void shouldCreateFastDrink() {
        MealFactory mealFactory = new FastFoodFactory();
        Assert.assertEquals(mealFactory.createDrink().getClass(), FastDrink.class);
    }

    @Test
    static void shouldCreateFastFood() {
        MealFactory mealFactory = new FastFoodFactory();
        Assert.assertEquals(mealFactory.createFood().getClass(), FastFood.class);
    }

    @Test
    static void shouldCreateExquisiteDrink() {
        MealFactory mealFactory = new ExquisiteFoodFactory();
        Assert.assertEquals(mealFactory.createDrink().getClass(), ExquisiteDrink.class);
    }

    @Test
    static void shouldCreateExquisiteFood() {
        MealFactory mealFactory = new ExquisiteFoodFactory();
        Assert.assertEquals(mealFactory.createFood().getClass(), ExquisiteFood.class);
    }
}
