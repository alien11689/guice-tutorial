package com.blogspot.przybyszd.guicetutorial.injectinginjector;

import com.google.inject.Injector;

import javax.inject.Inject;

/**
 * Created by alien on 27.04.14.
 */
public class Router {
    private Injector injector;

    public Injector getInjector() {
        return injector;
    }

    @Inject
    public Router(final Injector injector) {
        this.injector = injector;
    }
}
