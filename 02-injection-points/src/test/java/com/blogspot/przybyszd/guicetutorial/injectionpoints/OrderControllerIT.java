package com.blogspot.przybyszd.guicetutorial.injectionpoints;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

public class OrderControllerIT {
    @Test
    public void shouldInjectAllDependency() {
        //given
        Injector injector = Guice.createInjector();
        Order order = new Order("apple", 10);
        //when
        OrderController sut = injector.getInstance(OrderController.class);
        //then
        sut.invokeProcessing(order);
    }
}
