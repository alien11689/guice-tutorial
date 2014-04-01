package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Provider;

/**
 * Created by alien on 30.03.14.
 */
public class ReportSessionFactory implements Provider<ReportSession> {

    @Override
    public ReportSession get() {
        ReportSession reportSession = new ReportSession();
        reportSession.init();
        return reportSession;
    }
}
