package com.epam.kolpakova.abstract_factory;

import com.epam.kolpakova.abstract_factory.factories.ExquisiteFoodFactory;
import com.epam.kolpakova.abstract_factory.factories.FastFoodFactory;
import com.epam.kolpakova.abstract_factory.factories.MealFactory;

public class Demo {
    private enum MenuType {FAST, EXQUISITE}

    private static Order currentOrder;

    public static void main(String[] args) {
        currentOrder = configureOrder(MenuType.FAST);
        currentOrder.order();

        currentOrder = configureOrder(MenuType.EXQUISITE);
        currentOrder.order();
    }

    private static Order configureOrder(MenuType menuType) {
        MealFactory mealFactory;
        switch (menuType) {
            case FAST:
                mealFactory = new FastFoodFactory();
                break;
            case EXQUISITE:
                mealFactory = new ExquisiteFoodFactory();
                break;
            default:
                throw new IllegalArgumentException("This type of menu is not supported yet");
        }
        return new Order(mealFactory);
    }


}
