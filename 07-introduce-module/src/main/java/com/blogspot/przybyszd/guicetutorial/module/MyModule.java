package com.blogspot.przybyszd.guicetutorial.module;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule{
    @Override
    protected void configure() {
        try {
            bind(FirstClass.class).toConstructor(FirstClass.class.getConstructor(Dependency.class));
        } catch(NoSuchMethodException e) {
            // But i know it exists
            e.printStackTrace();
        }
    }
}
