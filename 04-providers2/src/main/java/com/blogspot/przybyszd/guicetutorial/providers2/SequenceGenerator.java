package com.blogspot.przybyszd.guicetutorial.providers2;

import javax.inject.Singleton;

@Singleton
public class SequenceGenerator {
    private int counter = 0;

    public int next(){
        return counter++;
    }
}
