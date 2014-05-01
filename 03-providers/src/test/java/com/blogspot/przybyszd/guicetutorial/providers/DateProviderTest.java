package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import javax.inject.Provider;
import java.util.Date;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class DateProviderTest {
    @Test
    public void shouldGetAnotherTimeForEachGet() throws InterruptedException {
        // given
        Injector injector = Guice.createInjector();
        Provider<Date> sut = injector.getProvider(Date.class);
        // when
        Date firstDate = sut.get();
        Thread.sleep(1);
        Date secondDate = sut.get();
        // then
        assertNotNull(firstDate);
        assertNotNull(secondDate);
        assertNotEquals(firstDate.getTime(), secondDate.getTime());
    }
}
