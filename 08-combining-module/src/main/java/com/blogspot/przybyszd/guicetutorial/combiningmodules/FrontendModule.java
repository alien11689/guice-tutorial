package com.blogspot.przybyszd.guicetutorial.combiningmodules;

import com.google.inject.AbstractModule;

public class FrontendModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Widget.class).to(LabelWidget.class);
    }
}
