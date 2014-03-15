package com.blogspot.przybyszd.guicetutorial.simplestinjection;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * Created by alien on 15.03.14.
 */
public class PersonControllerIT {

    @Test
    public void shouldGetPersonControllerFromInjectorAndPersistPerson(){
        Injector injector = Guice.createInjector();
        PersonController userController = injector.getInstance(PersonController.class);
        Person user = new Person("John", "Smith", 25);
        userController.add(user);
    }
}
