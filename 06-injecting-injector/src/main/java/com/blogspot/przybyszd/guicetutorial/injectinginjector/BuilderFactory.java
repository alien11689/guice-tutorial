package com.blogspot.przybyszd.guicetutorial.injectinginjector;

import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.DefaultBuilder;
import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.FirstBuilder;
import com.blogspot.przybyszd.guicetutorial.injectinginjector.builders.SecondBuilder;
import com.google.inject.Injector;

import javax.inject.Inject;

/**
 * Created by alien on 27.04.14.
 */
public class BuilderFactory {
    private Injector injector;

    @Inject
    public BuilderFactory(final Injector injector) {
        this.injector = injector;
    }

    public Builder getBuilder(String param){
        if("first".equals(param)){
            return injector.getInstance(FirstBuilder.class);
        } else if("second".equals(param)){
            return injector.getInstance(SecondBuilder.class);
        } else {
            return injector.getInstance(DefaultBuilder.class);
        }
    }
}
