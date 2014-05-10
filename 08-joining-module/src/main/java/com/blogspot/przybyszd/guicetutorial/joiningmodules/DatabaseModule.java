package com.blogspot.przybyszd.guicetutorial.joiningmodules;

import com.google.inject.AbstractModule;

public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SessionFactory.class).to(SessionFactoryImpl.class);
    }
}
