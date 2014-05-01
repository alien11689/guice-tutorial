package com.blogspot.przybyszd.guicetutorial.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ModuleTest {

    private Injector sut;

    @Before
    public void setUp(){
        sut = Guice.createInjector(new MyModule());
    }

    @Test
    public void shouldGetClassDefinedWithConstructor(){
        //when
        FirstClass result = sut.getInstance(FirstClass.class);
        //then
        assertNotNull(result);
    }

    @Test
    public void shouldGetInstanceDefinedWithInject(){
        //when
        SecondClass result = sut.getInstance(SecondClass.class);
        //then
        assertNotNull(result);
    }

    @Test
    public void shouldGetInstanceDefinedWithProvider(){
        //when
        ThirdClass result = sut.getInstance(ThirdClass.class);
        //then
        assertNotNull(result);
    }

    @Test
    public void shouldGetInstanceDefinedWithInstance(){
        //when
        FourthClass result = sut.getInstance(FourthClass.class);
        //then
        assertNotNull(result);
    }

    @Test
    public void shouldGetInstanceDefinedAsInterfaceImplementation(){
        //when
        SomeClass result = sut.getInstance(SomeClass.class);
        //then
        assertNotNull(result);
        assertEquals(FifthClass.class,result.getClass());
    }

    @Test
    public void shouldGetInstanceDefinedInSingletonScope(){
        //when
        SixthClass result1 = sut.getInstance(SixthClass.class);
        SixthClass result2 = sut.getInstance(SixthClass.class);
        //then
        assertNotNull(result1);
        assertNotNull(result2);
        assertEquals(result1, result2);
    }

    @Test
    public void shouldGetInstanceDefinedInDefultScpoe(){
        //when
        Dependency result1 = sut.getInstance(Dependency.class);
        Dependency result2 = sut.getInstance(Dependency.class);
        //then
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotEquals(result1, result2);
    }
}
