package com.blogspot.przybyszd.guicetutorial.interfaces;

import com.google.inject.ImplementedBy;

@ImplementedBy(PdfReportWriter.class)
public interface ReportWriter {
    void write();
}
