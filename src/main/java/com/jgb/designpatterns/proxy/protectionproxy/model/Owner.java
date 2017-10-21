package com.jgb.designpatterns.proxy.protectionproxy.model;

import com.jgb.designpatterns.proxy.protectionproxy.ReportGeneratorProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Owner implements Staff {

    private static final Logger LOG = LogManager.getLogger(Owner.class);

    private ReportGeneratorProxy reportGenerator;

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    @Override
    public boolean isOwner() {
        return true;
    }

    public String generateDailyReport() {
        try {
            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            LOG.error("Error generating report.", e);
        }
        return "";
    }

}
