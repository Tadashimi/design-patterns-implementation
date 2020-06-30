package com.epam.kolpakova.fabric_method;

import com.epam.kolpakova.fabric_method.factory.Factory;
import com.epam.kolpakova.fabric_method.factory.FactoryA;
import com.epam.kolpakova.fabric_method.factory.FactoryB;

public class Demo {
    public static Factory concreteFactory;

    public static void main(String[] args) {
        configureFactory('A');
        concreteFactory.doSomeStuff();

        configureFactory('B');
        concreteFactory.doSomeStuff();
    }

    private static void configureFactory(char productName) {
        switch (productName) {
            case 'A':
                concreteFactory = new FactoryA();
                break;
            case 'B':
                concreteFactory = new FactoryB();
                break;
            default:
                throw new IllegalArgumentException("This product is not supported");
        }
    }
}
