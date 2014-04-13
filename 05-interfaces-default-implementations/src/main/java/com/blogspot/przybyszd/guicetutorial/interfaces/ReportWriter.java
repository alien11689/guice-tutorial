package com.blogspot.przybyszd.guicetutorial.interfaces;

import com.google.inject.ImplementedBy;

/**
 * Created by alien on 13.04.14.
 */
@ImplementedBy(PdfReportWriter.class)
public interface ReportWriter {
    void write();
}
