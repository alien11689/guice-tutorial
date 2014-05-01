package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReportControllerTest {

    @Test
    public void shouldAddReportWithoutException(){
        //given
        Injector injector = Guice.createInjector();
        ReportController sut = injector.getInstance(ReportController.class);
        //when
        boolean result = sut.addReport("message");
        //then
        assertTrue(result);
    }
}
