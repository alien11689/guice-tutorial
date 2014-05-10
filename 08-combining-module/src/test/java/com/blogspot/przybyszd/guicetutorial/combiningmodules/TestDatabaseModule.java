package com.blogspot.przybyszd.guicetutorial.combiningmodules;

import com.google.inject.AbstractModule;

public class TestDatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SessionFactory.class).to(TestSessionFactoryImpl.class);
    }
}
