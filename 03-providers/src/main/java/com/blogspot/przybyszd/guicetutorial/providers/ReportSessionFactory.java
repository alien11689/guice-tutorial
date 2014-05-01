package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Provider;

public class ReportSessionFactory implements Provider<ReportSession> {

    @Override
    public ReportSession get() {
        ReportSession reportSession = new ReportSession();
        reportSession.init();
        return reportSession;
    }
}
