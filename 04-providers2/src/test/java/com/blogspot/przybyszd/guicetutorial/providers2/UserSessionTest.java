package com.blogspot.przybyszd.guicetutorial.providers2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alien on 05.04.14.
 */
public class UserSessionTest {

    @Test
    public void shouldGetEachTimeNewSession(){
        //given
        Injector sut = Guice.createInjector();
        //when
        UserSession userSession1 = sut.getInstance(UserSession.class);
        UserSession userSession2 = sut.getInstance(UserSession.class);
        //then
        assertNotEquals(userSession1, userSession2);
    }

    @Test
    public void shouldGetEachTimeNewSessionFromProvider(){
        //given
        Injector injector = Guice.createInjector();
        Provider<UserSession> sut = injector.getProvider(UserSession.class);
        //when
        UserSession userSession = sut.get();
        //then
        assertNotNull(userSession);
    }
}
