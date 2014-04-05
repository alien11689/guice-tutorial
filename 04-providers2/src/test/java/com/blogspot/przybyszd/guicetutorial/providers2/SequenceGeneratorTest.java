package com.blogspot.przybyszd.guicetutorial.providers2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alien on 05.04.14.
 */
public class SequenceGeneratorTest {

    @Test
    public void shouldGetNextNumberEachTime(){
        //given
        Injector injector = Guice.createInjector();
        SequenceGenerator sut = injector.getInstance(SequenceGenerator.class);
        //when
        int result1 = sut.next();
        int result2 = sut.next();
        //then
        assertEquals(result1 +1, result2);
    }

    @Test
    public void shouldGetTheSameSequenceGeneratorEachTime(){
        //given
        Injector injector = Guice.createInjector();
        //when
        SequenceGenerator sequenceGenerator1 = injector.getInstance(SequenceGenerator.class);
        SequenceGenerator sequenceGenerator2 = injector.getInstance(SequenceGenerator.class);
        //then
        assertEquals(sequenceGenerator1, sequenceGenerator2);
    }
}
