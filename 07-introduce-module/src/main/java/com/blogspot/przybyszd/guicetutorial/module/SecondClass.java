package com.blogspot.przybyszd.guicetutorial.module;

import javax.inject.Inject;

public class SecondClass {
    private Dependency dependency;

    @Inject
    public SecondClass(final Dependency dependency) {
        this.dependency = dependency;
    }
}
