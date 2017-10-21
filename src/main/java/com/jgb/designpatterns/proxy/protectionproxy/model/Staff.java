package com.jgb.designpatterns.proxy.protectionproxy.model;

import com.jgb.designpatterns.proxy.protectionproxy.ReportGeneratorProxy;

/**
 * @author txoppe
 * @since 21/10/2017 | 21:24
 */
public interface Staff {

    boolean isOwner();
    void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
