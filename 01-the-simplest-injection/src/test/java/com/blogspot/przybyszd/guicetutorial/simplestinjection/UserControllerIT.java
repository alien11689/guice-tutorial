package com.blogspot.przybyszd.guicetutorial.simplestinjection;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * Created by alien on 15.03.14.
 */
public class UserControllerIT {

    @Test
    public void shouldGetUserControllerFromInjectorAndPersistUser(){
        Injector injector = Guice.createInjector();
        UserController userController = injector.getInstance(UserController.class);
        User user = new User("John", "Smith", 25);
        userController.add(user);
    }
}
