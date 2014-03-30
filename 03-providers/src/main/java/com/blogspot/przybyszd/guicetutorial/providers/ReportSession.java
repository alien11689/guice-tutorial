package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.ProvidedBy;

/**
 * Created by alien on 30.03.14.
 */
@ProvidedBy(ReportSessionFactory.class)
public class ReportSession {
    private boolean initialized;

    public ReportSession() {}

    public void init() {
        this.initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }
}
