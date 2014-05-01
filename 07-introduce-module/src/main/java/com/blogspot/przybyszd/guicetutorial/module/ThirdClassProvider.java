package com.blogspot.przybyszd.guicetutorial.module;

import com.google.inject.Provider;

import javax.inject.Inject;

public class ThirdClassProvider implements Provider<ThirdClass> {

    private Dependency dependency;

    @Inject
    public ThirdClassProvider(final Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public ThirdClass get() {
        return new ThirdClass(dependency);
    }
}
