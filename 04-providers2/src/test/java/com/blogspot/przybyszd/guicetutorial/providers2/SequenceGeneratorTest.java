package com.blogspot.przybyszd.guicetutorial.providers2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldGetTheSameSequenceGeneratorEachTimeFromProvider(){
        //given
        Injector injector = Guice.createInjector();
        Provider<SequenceGenerator> sut = injector.getProvider(SequenceGenerator.class);
        //when
        SequenceGenerator sequenceGenerator1 = sut.get();
        SequenceGenerator sequenceGenerator2 = sut.get();
        //then
        assertEquals(sequenceGenerator1, sequenceGenerator2);
    }
}
