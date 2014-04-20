package com.blogspot.przybyszd.guicetutorial.interfaces;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alien on 13.04.14.
 */
public class InterfaceDefaultImplementationTest {
    @Test
    public void shouldGetImplementationOfInterface(){
        //given
        Injector sut = Guice.createInjector();
        //when
        ReportWriter reportWriter = sut.getInstance(ReportWriter.class);
        //then
        assertTrue(reportWriter instanceof PdfReportWriter);
    }
}
