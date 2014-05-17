package com.blogspot.przybyszd.guicetutorial.providerinmodule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProviderInModuleTest {
    @Test
    public void shouldClassInstanceFromProvider(){
        //given
        Injector sut = Guice.createInjector(new QuizModule());
        //when
        Quiz quiz = sut.getInstance(Quiz.class);
        //then
        assertTrue(quiz.initialized());
    }
}
