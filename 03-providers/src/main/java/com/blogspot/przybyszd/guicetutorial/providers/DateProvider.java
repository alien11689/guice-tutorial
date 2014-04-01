package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Provides;

import java.util.Date;

/**
 * Created by alien on 30.03.14.
 */
public class DateProvider {

    @Provides
    Date getDate(){
        return new Date();
    }
}
