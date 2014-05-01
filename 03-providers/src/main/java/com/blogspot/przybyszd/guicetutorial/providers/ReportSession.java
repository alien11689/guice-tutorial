package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.ProvidedBy;

import java.util.Date;

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

    public boolean report(final String reportMessage, final Date date) {
        if(!initialized){
            return false;
        }
        // ...
        return true;
    }
}
