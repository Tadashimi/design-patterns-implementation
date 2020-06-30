package com.epam.kolpakova.fabric_method_tests;

import com.epam.kolpakova.fabric_method.factory.Factory;
import com.epam.kolpakova.fabric_method.factory.FactoryA;
import com.epam.kolpakova.fabric_method.factory.FactoryB;
import com.epam.kolpakova.fabric_method.products.Product;
import com.epam.kolpakova.fabric_method.products.ProductA;
import com.epam.kolpakova.fabric_method.products.ProductB;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FactoryUnitTests {
    @Test
    static void shouldCreateProductA() {
        Factory factory = new FactoryA();
        Assert.assertEquals(factory.createProduct().getClass(), ProductA.class);
    }

    @Test
    static void shouldCreateProductB() {
        Factory factory = new FactoryB();
        Assert.assertEquals(factory.createProduct().getClass(), ProductB.class);
    }

    //TODO Fix this test
    @Test
    static void shouldInvokeProductAMethod() {
        Factory factory = new FactoryA();
        Product product = mock(Product.class);
        doNothing().when(product).doStuff();
        factory.doSomeStuff();
        verify(product).doStuff();
    }
}
