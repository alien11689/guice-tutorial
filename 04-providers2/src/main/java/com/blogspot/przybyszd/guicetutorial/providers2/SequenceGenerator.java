package com.blogspot.przybyszd.guicetutorial.providers2;

import javax.inject.Singleton;

/**
 * Created by alien on 05.04.14.
 */
@Singleton
public class SequenceGenerator {
    private int counter = 0;

    public int next(){
        return counter++;
    }
}
