package com.blogspot.przybyszd.guicetutorial.providerinmodule;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class QuizModule extends AbstractModule {
    @Override
    protected void configure() {}

    @Provides
    private Quiz getinitializedQuiz(){
        Quiz quiz = new Quiz();
        quiz.init();
        return quiz;
    }
}
