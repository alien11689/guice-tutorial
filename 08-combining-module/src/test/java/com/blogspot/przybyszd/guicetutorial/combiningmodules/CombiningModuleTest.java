package com.blogspot.przybyszd.guicetutorial.combiningmodules;

import com.google.inject.CreationException;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CombiningModuleTest {
    @Test
    public void shouldJoinTwoDisjointModules(){
        //when
        Injector sut = Guice.createInjector(new DatabaseModule(), new FrontendModule());
        //then
        assertNotNull(sut.getInstance(SessionFactory.class));
        assertNotNull(sut.getInstance(Widget.class));
    }

    @Test(expected = CreationException.class)
    public void shouldThrowExceptionWhenJoiningTwoModulesWithTheSameBindings(){
        Guice.createInjector(new DatabaseModule(), new TestDatabaseModule());
    }

    @Test
    public void shouldOverrideModule(){
        //when
        Injector sut = Guice.createInjector(Modules.override(new DatabaseModule()).with(new TestDatabaseModule()));
        //then
        assertEquals(TestSessionFactoryImpl.class, sut.getInstance(SessionFactory.class).getClass());
    }
}
