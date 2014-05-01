package com.blogspot.przybyszd.guicetutorial.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class MyModule extends AbstractModule{
    @Override
    protected void configure() {
        try {
            bind(FirstClass.class).toConstructor(FirstClass.class.getConstructor(Dependency.class));
        } catch(NoSuchMethodException e) {
            // But i know it exists
            e.printStackTrace();
        }
        bind(ThirdClass.class).toProvider(ThirdClassProvider.class);
        bind(FourthClass.class).toInstance(new FourthClass(new Dependency()));
        bind(SomeClass.class).to(FifthClass.class);
        try {
            bind(SixthClass.class).toConstructor(SixthClass.class.getConstructor(Dependency.class)).in(Singleton.class);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
