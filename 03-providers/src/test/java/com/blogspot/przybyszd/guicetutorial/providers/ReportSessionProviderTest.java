package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alien on 30.03.14.
 */
public class ReportSessionProviderTest {
    @Test
    public void shouldInitReportSession() {
        // given
        Injector injector = Guice.createInjector();
        ReportSession sut = injector.getInstance(ReportSession.class);
        // when
        boolean result = sut.isInitialized();
        // then
        assertTrue(result);
    }
}
