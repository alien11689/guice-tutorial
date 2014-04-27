package com.blogspot.przybyszd.guicetutorial.injectinginjector;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by alien on 27.04.14.
 */
public class InjectingInjectorTest {

    @Test
    public void shouldInjectInjectorFromInjector(){
        //given
        Injector sut = Guice.createInjector();
        //when
        Injector result = sut.getInstance(Injector.class);
        //then
        assertEquals(sut, result);
    }

    @Test
    public void shouldInjectInjectorToClass(){
        //given
        Injector sut = Guice.createInjector();
        //when
        Router router = sut.getInstance(Router.class);
        //then
        assertTrue(router.getInjector() instanceof Injector);
    }
}
