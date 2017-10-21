package com.jgb.designpatterns.proxy.protectionproxy;

import com.jgb.designpatterns.proxy.protectionproxy.model.Staff;
import com.jgb.designpatterns.proxy.remoteproxy.ReportGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.Naming;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    private static final Logger LOG = LogManager.getLogger(ReportGeneratorProtectionProxy.class);

    private Staff staff;

    ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            try {
                ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (Exception e) {
                LOG.error("Error generating report.", e);
            }
            return "";
        } else {
            return "Not Authorized to view report.";
        }
    }
}
