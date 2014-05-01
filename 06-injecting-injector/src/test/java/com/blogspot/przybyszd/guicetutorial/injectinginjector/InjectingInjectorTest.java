package com.blogspot.przybyszd.guicetutorial.injectinginjector;

import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.DefaultBuilder;
import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.FirstBuilder;
import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.SecondBuilder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void shouldGetFirstBuilderFromFactory(){
        //given
        Injector sut = Guice.createInjector();
        BuilderFactory builderFactory = sut.getInstance(BuilderFactory.class);
        //when
        Builder builder = builderFactory.getBuilder("first");
        //then
        assertTrue(builder instanceof FirstBuilder);
    }

    @Test
    public void shouldGetSecondBuilderFromFactory(){
        //given
        Injector sut = Guice.createInjector();
        BuilderFactory builderFactory = sut.getInstance(BuilderFactory.class);
        //when
        Builder builder = builderFactory.getBuilder("second");
        //then
        assertTrue(builder instanceof SecondBuilder);
    }

    @Test
    public void shouldGetDefaultBuilderFromFactory(){
        //given
        Injector sut = Guice.createInjector();
        BuilderFactory builderFactory = sut.getInstance(BuilderFactory.class);
        //when
        Builder builder = builderFactory.getBuilder("unknown");
        //then
        assertTrue(builder instanceof DefaultBuilder);
    }
}
