package com.blogspot.przybyszd.guicetutorial.module;

import javax.inject.Inject;

public class FifthClass implements SomeClass{
    private Dependency dependency;

    @Inject
    public FifthClass(final Dependency dependency) {
        this.dependency = dependency;
    }
}
