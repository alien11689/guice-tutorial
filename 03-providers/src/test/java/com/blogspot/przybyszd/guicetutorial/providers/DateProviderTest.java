package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import javax.inject.Provider;
import java.util.Date;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alien on 30.03.14.
 */
public class DateProviderTest {
    @Test
    public void shouldGetAnotherTimeForEachGet() throws InterruptedException {
        // given
        Injector injector = Guice.createInjector();
        Provider<Date> dateProvider = injector.getProvider(Date.class);
        Date firstDate = dateProvider.get();
        Thread.sleep(1);
        // when
        Date secondDate = dateProvider.get();
        // then
        assertNotNull(firstDate);
        assertNotNull(secondDate);
        assertNotEquals(firstDate.getTime(), secondDate.getTime());
    }
}
