package com.blogspot.przybyszd.guicetutorial.providers;

import com.google.inject.Provider;

import javax.inject.Inject;
import java.util.Date;

public class ReportController {

    private final ReportSession reportSession;
    private final Provider<Date> dateProvider;

    @Inject
    public ReportController(ReportSession reportSession, Provider<Date> dateProvider) {
        this.reportSession = reportSession;
        this.dateProvider = dateProvider;
    }

    public boolean addReport(String reportMessage) {
        return reportSession.report(reportMessage, dateProvider.get());
    }
}
