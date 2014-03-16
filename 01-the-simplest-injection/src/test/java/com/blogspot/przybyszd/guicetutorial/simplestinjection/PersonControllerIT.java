package com.blogspot.przybyszd.guicetutorial.simplestinjection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class PersonControllerIT {

    @Test
    public void shouldGetPersonValidatorWithoutException() {
        //given
        Injector injector = Guice.createInjector();
        //when
        PersonValidator personValidator = injector.getInstance(PersonValidator.class);
        //then
        assertNotNull(personValidator);
    }

    @Test
    public void shouldGetPersonDaoWithoutException() {
        //given
        Injector injector = Guice.createInjector();
        //when
        PersonDao personDao = injector.getInstance(PersonDao.class);
        //then
        assertNotNull(personDao);
    }

    @Test
    public void shouldGetPersonControllerFromInjectorAndPersistPerson() {
        //given
        Injector injector = Guice.createInjector();
        Person user = new Person("John", "Smith", 25);
        //when
        PersonController userController = injector.getInstance(PersonController.class);
        //then
        userController.add(user);
    }
}
